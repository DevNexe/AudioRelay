package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import defpackage.ca7;
import defpackage.lu2;
import defpackage.ma1;
import defpackage.na1;
import defpackage.oa3;
import defpackage.os;
import defpackage.v50;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class F1<T extends IInterface> extends QnHx<T> implements com.google.android.gms.common.api.QnHx.NUlFixed {
    public final Set<Scope> E;
    public final Account F;

    /* JADX WARN: Illegal instructions before constructor call */
    public F1(Context context, Looper looper, int i, os osVar, v50 v50Var, lu2 lu2Var) {
        ca7 ca7VarA = ma1.a(context);
        na1 na1Var = na1.d;
        oa3.h(v50Var);
        oa3.h(lu2Var);
        super(context, looper, ca7VarA, na1Var, i, new LPt8Fixed(v50Var), new NUlFixed(lu2Var), osVar.g);
        this.F = osVar.a;
        Set<Scope> set = osVar.c;
        Iterator<Scope> it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.E = set;
    }

    @Override // com.google.android.gms.common.api.QnHx.NUlFixed
    public final Set<Scope> a() {
        return requiresSignIn() ? this.E : Collections.emptySet();
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final void e() {
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final Set<Scope> g() {
        return this.E;
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final Account getAccount() {
        return this.F;
    }
}
