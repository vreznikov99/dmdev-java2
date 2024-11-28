package homework;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Path pathItemsNames = Path.of("src", "homework", "files", "items-name.csv");
        Path pathItemsPrice = Path.of("src", "homework", "files", "items-price.csv");

        Map<Integer, Item> namesMap = UtilClass.mapItemNames(pathItemsNames);
        Map<Integer, Double> priceMap = UtilClass.mapItemPrice(pathItemsPrice);

        Path pathErrors = Path.of("src", "homework", "files", "errors.csv");
        UtilClass.writeErrorFile(pathErrors, namesMap, priceMap);

        Map<Integer, ResultItem> resultItemMap = UtilClass.mapNamesPrice(namesMap, priceMap);
        System.out.println(resultItemMap);

        Path pathResult = Path.of("src", "homework", "files", "result.csv");
        UtilClass.writeResultFile(pathResult, resultItemMap);

    }
}
