package homework;

import homework.Item;
import homework.ResultItem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import static java.nio.file.StandardOpenOption.APPEND;

public final class UtilClass {
    private UtilClass() {
    }

    public static Map<Integer, Item> mapItemNames(Path itemsNames) throws IOException {
        try (Stream<String> stream = Files.lines(itemsNames)) {
            Map<Integer, Item> result = stream.skip(1)
                    .map(str -> str.split(",", 3))
                    .collect(Collectors.toMap(
                                    arr -> Integer.parseInt(arr[0]),
                                    arr -> new Item(arr[1], arr[2])
                            )
                    );
            return result;
        }

    }

    public static Map<Integer, Double> mapItemPrice(Path itemsPrice) throws IOException {
        try (Stream<String> stream = Files.lines(itemsPrice)) {
            Map<Integer, Double> result = stream.skip(1)
                    .map(str -> str.split(",", 2))
                    .collect(Collectors.toMap(
                            arr -> Integer.parseInt(arr[0]),
                            arr -> Double.parseDouble(arr[1])
                    ));
            return result;
        }
    }

    /**
     * Result: ID, Name, Price
     */
    public static Map<Integer, ResultItem> mapNamesPrice(Map<Integer, Item> namesMap, Map<Integer, Double> priceMap) {
        Map<Integer, ResultItem> map = namesMap.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> new ResultItem(
                                entry.getValue().getName(),
                                priceMap.get(entry.getKey()))
                ));
        return map;
    }


    public static void writeResultFile(Path pathResult, Map<Integer, ResultItem> resultItemMap) throws IOException {
        File resultFile = pathResult.toFile();
        resultFile.createNewFile();
        try (FileWriter fileWriter = new FileWriter(resultFile)) {
            fileWriter.write("ID,NAME,PRICE\n");
            for (Map.Entry<Integer, ResultItem> entry : resultItemMap.entrySet()) {
                if (entry.getValue().getPrice() != null) {
                    fileWriter.append(
                            entry.getKey() + "," +
                                    entry.getValue().getName() + "," +
                                    entry.getValue().getPrice() + "\n"
                    );
                }
            }
        }
    }

    public static void writeErrorFile(Path pathErrors, Map<Integer, Item> namesMap, Map<Integer, Double> priceMap) throws IOException {
        File file = pathErrors.toFile();
        List<String> errorKey = Stream.concat(
                        namesMap.keySet().stream().filter(key -> !priceMap.containsKey(key)),
                        priceMap.keySet().stream().filter(key -> !namesMap.containsKey(key))
                ).sorted()
                .map(String::valueOf)
                .toList();

        List<String> result = Stream.concat(Stream.of("ID"), errorKey.stream()).toList();
        Files.write(pathErrors, result);
    }
}
