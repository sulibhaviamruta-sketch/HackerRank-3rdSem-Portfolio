public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int alice = 0;
    int bob = 0;

    for (int i = 0; i < 3; i++) {
        if (a.get(i) > b.get(i)) {
            alice++;
        } else if (a.get(i) < b.get(i)) {
            bob++;
        }
    }

    List<Integer> result = new ArrayList<>();
    result.add(alice);
    result.add(bob);

    return result;
}
