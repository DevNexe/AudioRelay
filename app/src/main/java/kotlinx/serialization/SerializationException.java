package kotlinx.serialization;

/* JADX INFO: loaded from: classes3.dex */
public class SerializationException extends IllegalArgumentException {
    public SerializationException() {
    }

    public SerializationException(String str) {
        super(str);
    }

    public SerializationException(String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
    }
}
