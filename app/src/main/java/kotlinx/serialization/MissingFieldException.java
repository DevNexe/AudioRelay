package kotlinx.serialization;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MissingFieldException extends SerializationException {
    public final List<String> w;

    public MissingFieldException() {
        throw null;
    }

    public MissingFieldException(List list, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        this.w = list;
    }
}
