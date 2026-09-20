package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.QnHx.F1;
import defpackage.Hp;
import defpackage.Q6g;
import defpackage.d60;
import defpackage.eq5;
import defpackage.gq5;
import defpackage.gt3;
import defpackage.ht3;
import defpackage.kc7;
import defpackage.kq5;
import defpackage.mr5;
import defpackage.os;
import defpackage.pa1;
import defpackage.su4;
import defpackage.tp5;
import defpackage.tq5;
import defpackage.x53;
import defpackage.z05;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class CQf<O extends com.google.android.gms.common.api.QnHx.F1> {
    public final Context a;
    public final String b;
    public final com.google.android.gms.common.api.QnHx<O> c;
    public final O d;
    public final Hp<O> e;
    public final int f;
    public final su4 g;
    public final pa1 h;

    public static class QnHx {
        public static final QnHx b = new QnHx(new su4(), Looper.getMainLooper());
        public final su4 a;

        public QnHx(su4 su4Var, Looper looper) {
            this.a = su4Var;
        }
    }

    public CQf() {
        throw null;
    }

    public CQf(Context context, com.google.android.gms.common.api.QnHx<O> qnHx, O o, QnHx qnHx2) {
        String str;
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        }
        if (qnHx == null) {
            throw new NullPointerException("Api must not be null.");
        }
        if (qnHx2 == null) {
            throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        }
        this.a = context.getApplicationContext();
        if (x53.b()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                str = null;
            }
        } else {
            str = null;
        }
        this.b = str;
        this.c = qnHx;
        this.d = o;
        this.e = new Hp<>(qnHx, o, str);
        pa1 pa1VarE = pa1.e(this.a);
        this.h = pa1VarE;
        this.f = pa1VarE.D.getAndIncrement();
        this.g = qnHx2.a;
        mr5 mr5Var = pa1VarE.I;
        mr5Var.sendMessage(mr5Var.obtainMessage(7, this));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    public final os.QnHx b() {
        Account accountB;
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        os.QnHx qnHx = new os.QnHx();
        O o = this.d;
        boolean z = o instanceof com.google.android.gms.common.api.QnHx.F1.CQf;
        if (z && (googleSignInAccountA2 = ((com.google.android.gms.common.api.QnHx.F1.CQf) o).a()) != null) {
            String str = googleSignInAccountA2.z;
            if (str == null) {
                accountB = null;
            } else {
                accountB = new Account(str, "com.google");
            }
        } else if (o instanceof com.google.android.gms.common.api.QnHx.F1.InterfaceC0073QnHx) {
            accountB = ((com.google.android.gms.common.api.QnHx.F1.InterfaceC0073QnHx) o).b();
        } else {
            accountB = null;
        }
        qnHx.a = accountB;
        Collection<? extends Scope> collectionEmptySet = (!z || (googleSignInAccountA = ((com.google.android.gms.common.api.QnHx.F1.CQf) o).a()) == null) ? Collections.emptySet() : googleSignInAccountA.b();
        if (qnHx.b == null) {
            qnHx.b = new Q6g<>();
        }
        qnHx.b.addAll(collectionEmptySet);
        Context context = this.a;
        qnHx.d = context.getClass().getName();
        qnHx.c = context.getPackageName();
        return qnHx;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    public final kc7 c(int i, kq5 kq5Var) {
        eq5 eq5Var;
        z05 z05Var = new z05();
        pa1 pa1Var = this.h;
        pa1Var.getClass();
        int i2 = kq5Var.c;
        final mr5 mr5Var = pa1Var.I;
        kc7<TResult> kc7Var = z05Var.a;
        if (i2 != 0) {
            Hp<O> hp = this.e;
            if (pa1Var.a()) {
                ht3 ht3Var = gt3.a().a;
                boolean z = true;
                if (ht3Var != null) {
                    if (ht3Var.x) {
                        tp5 tp5Var = (tp5) pa1Var.F.get(hp);
                        if (tp5Var != null) {
                            Object obj = tp5Var.x;
                            if (obj instanceof com.google.android.gms.common.internal.QnHx) {
                                com.google.android.gms.common.internal.QnHx qnHx = (com.google.android.gms.common.internal.QnHx) obj;
                                if (!qnHx.hasConnectionInfo() || qnHx.isConnecting()) {
                                    z = ht3Var.y;
                                } else {
                                    d60 d60VarA = eq5.a(tp5Var, qnHx, i2);
                                    if (d60VarA != null) {
                                        tp5Var.H++;
                                        z = d60VarA.y;
                                    }
                                }
                            }
                        } else {
                            z = ht3Var.y;
                        }
                    }
                    eq5Var = null;
                }
                eq5Var = new eq5(pa1Var, i2, hp, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            } else {
                eq5Var = null;
            }
            if (eq5Var != null) {
                mr5Var.getClass();
                kc7Var.b(new Executor() { // from class: op5
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        mr5Var.post(runnable);
                    }
                }, eq5Var);
            }
        }
        mr5Var.sendMessage(mr5Var.obtainMessage(4, new gq5(new tq5(i, kq5Var, z05Var, this.g), pa1Var.E.get(), this)));
        return kc7Var;
    }
}
