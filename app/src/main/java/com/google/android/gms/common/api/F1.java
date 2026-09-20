package com.google.android.gms.common.api;

import defpackage.lu2;
import defpackage.v50;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class F1 {

    @GuardedBy("sAllClients")
    public static final Set<F1> a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface CQf extends lu2 {
    }

    @Deprecated
    public interface QnHx extends v50 {
    }
}
