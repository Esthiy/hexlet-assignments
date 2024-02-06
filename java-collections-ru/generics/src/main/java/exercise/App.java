package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// BEGIN
class App {
    public static <T> List<Map<T, T>> findWhere(List<Map<T, T>> books, Map<T, T> where) {
        var result = new ArrayList<Map<T, T>>();
        var whereParamsNames = where.keySet();
        for (Map<T, T> bookParams : books) {
            var isEqual = false;

            if (!bookParams.keySet().containsAll(whereParamsNames)) {
                break;
            }

            for (var paramName : whereParamsNames) {
                if (!bookParams.get(paramName).equals(where.get(paramName))) {
                    isEqual = false;
                    break;
                } else {
                    isEqual = true;
                }
            }
            if (isEqual) {
                result.add(bookParams);
            }
        }
        return result;
    }
}
//END
