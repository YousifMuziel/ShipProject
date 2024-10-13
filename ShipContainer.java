class ShipContainer {
    private final int containerID;

    public ShipContainer(int containerID) {
        this.containerID = containerID;
    }

    public String containerContentList() {
        return "";
    }

    public void printContent() {
        System.out.println("Container " + containerID + " is empty.");
    }

    public int getContainerID() {
        return containerID;
    }
}
