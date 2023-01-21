import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


public class Mainclass {

    public static void mainclass(String [] args){
        try {

            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot( new tgbot());
        }
        catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
