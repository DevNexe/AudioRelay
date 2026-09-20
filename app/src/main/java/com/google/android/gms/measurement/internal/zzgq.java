package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.QnHx;
import defpackage.bi6;
import defpackage.d37;
import defpackage.d76;
import defpackage.db7;
import defpackage.dq6;
import defpackage.el6;
import defpackage.en6;
import defpackage.ft5;
import defpackage.h37;
import defpackage.iq5;
import defpackage.jg0;
import defpackage.ld5;
import defpackage.lh6;
import defpackage.m16;
import defpackage.m37;
import defpackage.oa3;
import defpackage.p97;
import defpackage.px5;
import defpackage.qr6;
import defpackage.r27;
import defpackage.ra1;
import defpackage.ro6;
import defpackage.rs6;
import defpackage.ta7;
import defpackage.vt5;
import defpackage.wr6;
import defpackage.zt6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgq extends zzed {
    public final r27 w;
    public Boolean x;
    public String y;

    public zzgq(r27 r27Var) {
        oa3.h(r27Var);
        this.w = r27Var;
        this.y = null;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void A(p97 p97Var) {
        oa3.e(p97Var.w);
        O0(p97Var.w, false);
        M0(new ta7(this, p97Var, 11));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List C(String str, String str2, String str3) {
        O0(str, true);
        r27 r27Var = this.w;
        try {
            return (List) r27Var.zzaz().k(new qr6(this, str, str2, str3, 1)).get();
        } catch (InterruptedException | ExecutionException e) {
            r27Var.zzay().f.c(e, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void D(p97 p97Var) {
        N0(p97Var);
        M0(new iq5(9, this, p97Var));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void I0(m16 m16Var, p97 p97Var) {
        oa3.h(m16Var);
        N0(p97Var);
        M0(new d76(this, m16Var, p97Var, 2));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void J(p97 p97Var) {
        N0(p97Var);
        M0(new rs6(this, p97Var, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void L(d37 d37Var, p97 p97Var) {
        oa3.h(d37Var);
        N0(p97Var);
        M0(new d76(this, d37Var, p97Var, 3));
    }

    public final void L0(m16 m16Var, p97 p97Var) {
        r27 r27Var = this.w;
        r27Var.a();
        r27Var.f(m16Var, p97Var);
    }

    public final void M0(Runnable runnable) {
        r27 r27Var = this.w;
        if (r27Var.zzaz().o()) {
            runnable.run();
        } else {
            r27Var.zzaz().m(runnable);
        }
    }

    public final void N0(p97 p97Var) {
        oa3.h(p97Var);
        String str = p97Var.w;
        oa3.e(str);
        O0(str, false);
        this.w.M().E(p97Var.x, p97Var.M);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void O(ft5 ft5Var, p97 p97Var) {
        oa3.h(ft5Var);
        oa3.h(ft5Var.y);
        N0(p97Var);
        ft5 ft5Var2 = new ft5(ft5Var);
        ft5Var2.w = p97Var.w;
        M0(new d76(this, ft5Var2, p97Var, 1));
    }

    public final void O0(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        r27 r27Var = this.w;
        if (zIsEmpty) {
            r27Var.zzay().f.b("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.x == null) {
                    this.x = Boolean.valueOf("com.google.android.gms".equals(this.y) || ld5.a(r27Var.l.a, Binder.getCallingUid()) || QnHx.a(r27Var.l.a).b(Binder.getCallingUid()));
                }
                if (this.x.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                r27Var.zzay().f.c(bi6.n(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.y == null) {
            Context context = r27Var.l.a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = ra1.a;
            if (ld5.b(context, str, callingUid)) {
                this.y = str;
            }
        }
        if (str.equals(this.y)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List P(String str, String str2, p97 p97Var) {
        N0(p97Var);
        String str3 = p97Var.w;
        oa3.h(str3);
        r27 r27Var = this.w;
        try {
            return (List) r27Var.zzaz().k(new db7(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            r27Var.zzay().f.c(e, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void V(long j, String str, String str2, String str3) {
        M0(new zt6(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final String d(p97 p97Var) {
        N0(p97Var);
        r27 r27Var = this.w;
        try {
            return (String) r27Var.zzaz().k(new el6(r27Var, p97Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bi6 bi6VarZzay = r27Var.zzay();
            bi6VarZzay.f.d(bi6.n(p97Var.w), "Failed to get app instance id. appId", e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void h0(p97 p97Var) {
        oa3.e(p97Var.w);
        oa3.h(p97Var.R);
        rs6 rs6Var = new rs6(this, p97Var, 0);
        r27 r27Var = this.w;
        if (r27Var.zzaz().o()) {
            rs6Var.run();
        } else {
            r27Var.zzaz().n(rs6Var);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List m(String str, String str2, String str3, boolean z) {
        O0(str, true);
        r27 r27Var = this.w;
        try {
            List<h37> list = (List) r27Var.zzaz().k(new wr6(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (h37 h37Var : list) {
                if (z || !m37.P(h37Var.c)) {
                    arrayList.add(new d37(h37Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            bi6 bi6VarZzay = r27Var.zzay();
            bi6VarZzay.f.d(bi6.n(str), "Failed to get user properties as. appId", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List m0(String str, String str2, boolean z, p97 p97Var) {
        N0(p97Var);
        String str3 = p97Var.w;
        oa3.h(str3);
        r27 r27Var = this.w;
        try {
            List<h37> list = (List) r27Var.zzaz().k(new qr6(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (h37 h37Var : list) {
                if (z || !m37.P(h37Var.c)) {
                    arrayList.add(new d37(h37Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            bi6 bi6VarZzay = r27Var.zzay();
            bi6VarZzay.f.d(bi6.n(str3), "Failed to query user properties. appId", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void s(Bundle bundle, p97 p97Var) {
        N0(p97Var);
        String str = p97Var.w;
        oa3.h(str);
        M0(new px5(this, str, bundle, 2));
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final byte[] v0(m16 m16Var, String str) {
        oa3.e(str);
        oa3.h(m16Var);
        O0(str, true);
        r27 r27Var = this.w;
        bi6 bi6VarZzay = r27Var.zzay();
        dq6 dq6Var = r27Var.l;
        lh6 lh6Var = dq6Var.m;
        String str2 = m16Var.w;
        bi6VarZzay.m.c(lh6Var.d(str2), "Log and bundle. event");
        ((jg0) r27Var.b()).getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        ro6 ro6VarZzaz = r27Var.zzaz();
        vt5 vt5Var = new vt5(this, m16Var, str);
        ro6VarZzaz.g();
        en6 en6Var = new en6(ro6VarZzaz, vt5Var, true);
        if (Thread.currentThread() == ro6VarZzaz.c) {
            en6Var.run();
        } else {
            ro6VarZzaz.p(en6Var);
        }
        try {
            byte[] bArr = (byte[]) en6Var.get();
            if (bArr == null) {
                r27Var.zzay().f.c(bi6.n(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((jg0) r27Var.b()).getClass();
            r27Var.zzay().m.e("Log and bundle processed. event, size, time_ms", dq6Var.m.d(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            bi6 bi6VarZzay2 = r27Var.zzay();
            bi6VarZzay2.f.e("Failed to log and bundle. appId, event, error", bi6.n(str), dq6Var.m.d(str2), e);
            return null;
        }
    }
}
