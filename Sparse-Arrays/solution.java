public static List<Integer> matchingStrings(
        List<String> stringList, List<String> queries) {

    Map<String, Integer> frequency = new HashMap<>();

    for (String str : stringList) {
        frequency.put(str, frequency.getOrDefault(str, 0) + 1);
    }

    List<Integer> result = new ArrayList<>();

    for (String query : queries) {
        result.add(frequency.getOrDefault(query, 0));
    }

    return result;
}
