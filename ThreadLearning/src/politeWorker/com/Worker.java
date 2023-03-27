package politeWorker.com;

public class Worker {
    private String name;
    private boolean active;

    public Worker(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public synchronized void work(SharedResource sharedResource, Worker worker) {
        while (active) {
            if (sharedResource.getOwner() != this) {
                try {
                    wait(10);
                } catch (InterruptedException e) {

                }
                continue;
            }
            if (worker.isActive()) {
                System.out.println(getName()+" : give the resource to the worker "+ worker.getName());
                sharedResource.setOwner(worker);
                continue;
            }
            System.out.println(getName()+": working on the common resource");
            active = false;
            sharedResource.setOwner(worker);
        }
    }
}
