package app;

import repository.SistemaRepository;
import service.SistemaService;
import ui.Menu;

public class Main {

    public static void main(String[] args) {

        SistemaRepository repository = new SistemaRepository();

        SistemaService service = new SistemaService(repository);

        Menu menu = new Menu(service);

        menu.exibirMenu();
    }
}