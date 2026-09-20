package defpackage;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class sc7 {
    public static final sc7 d = new sc7(true, null, null);
    public final boolean a;

    @Nullable
    public final String b;

    @Nullable
    public final Throwable c;

    public sc7(boolean z, @Nullable String str, @Nullable Exception exc) {
        this.a = z;
        this.b = str;
        this.c = exc;
    }

    public static sc7 b(String str) {
        return new sc7(false, str, null);
    }

    public static sc7 c(String str, Exception exc) {
        return new sc7(false, str, exc);
    }

    @Nullable
    public String a() {
        return this.b;
    }
}
