package okhttp3.internal.http2;

import defpackage.rt0;
import defpackage.ur1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamResetException extends IOException {
    public final rt0 w;

    public StreamResetException(rt0 rt0Var) {
        super(ur1.d(rt0Var, "stream was reset: "));
        this.w = rt0Var;
    }
}
