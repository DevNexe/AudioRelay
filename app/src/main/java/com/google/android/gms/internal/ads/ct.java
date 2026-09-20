package com.google.android.gms.internal.ads;

import defpackage.B8C;
import defpackage.yp6;
import defpackage.zp6;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ct extends SjP {
    public static final B8C F;
    public static final Logger G = Logger.getLogger(ct.class.getName());

    @CheckForNull
    public volatile Set<Throwable> D = null;
    public volatile int E;

    static {
        B8C zp6Var;
        try {
            zp6Var = new yp6(AtomicReferenceFieldUpdater.newUpdater(ct.class, Set.class, "D"), AtomicIntegerFieldUpdater.newUpdater(ct.class, "E"));
            e = null;
        } catch (Error | RuntimeException e) {
            e = e;
            zp6Var = new zp6();
        }
        Throwable th = e;
        F = zp6Var;
        if (th != null) {
            G.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public ct(int i) {
        this.E = i;
    }
}
