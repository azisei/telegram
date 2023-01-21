
     import org.telegram.telegrambots.TelegramLongPollingBot;
     import org.telegram.telegrambots.meta.api.object.update;


     public final class tgbot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        

        if(command.equal("/run")){
            System.out.println("hi,i am aziza");
        }
    }

    @Override
    public String getBotUsername() {
        // TODO
        return "azisei@bot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "5855365248:AAGo6nTDsCQ_js5rK4KpO1OYOv0pmrLrPuI";
    }
}
