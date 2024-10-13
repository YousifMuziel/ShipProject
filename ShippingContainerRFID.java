import java.util.LinkedList;

class ShippingContainerRFID extends ShipContainer {
    private final LinkedList<String> contents;
    private final LinkedList<Integer> count;

    public ShippingContainerRFID(int containerID) {
        super(containerID);
        contents = new LinkedList<>();
        count = new LinkedList<>();
    }

    public void setContents(String item) {
        int index = contents.indexOf(item);
        if (index == -1) {
            contents.add(item);
            count.add(1);
        } else {
            count.set(index, count.get(index) + 1);
        }
    }

    @Override
    public String containerContentList() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < contents.size(); i++) {
            result.append(count.get(i)).append(" ").append(contents.get(i));
            if (i < contents.size() - 1) {
                result.append(". ");
            }
        }
        return result.toString();
    }
}
