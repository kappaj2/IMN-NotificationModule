package za.co.tman.notification.service.messaging;

public interface IMMessageProcessor {
    
    void processMessageReceived(InterModulePubSubMessage interModulePubSubMessage);

}
