package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Xn1 {
    public static final Xn1 d = new Xn1();

    @CheckForNull
    public final Runnable a;

    @CheckForNull
    public final Executor b;

    @CheckForNull
    public Xn1 c;

    public Xn1() {
        this.a = null;
        this.b = null;
    }

    public Xn1(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
