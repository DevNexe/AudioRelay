package kotlinx.serialization;

import defpackage.GM;

/* JADX INFO: loaded from: classes3.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i) {
        super(GM.a("An unknown field for index ", i));
    }
}
