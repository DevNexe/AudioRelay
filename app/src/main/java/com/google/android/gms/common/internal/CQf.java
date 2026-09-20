package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import defpackage.b47;
import defpackage.com5Fixed;
import defpackage.tw0;

/* JADX INFO: loaded from: classes.dex */
public final class CQf extends com5Fixed {
    public static final Parcelable.Creator<CQf> CREATOR = new b47();
    public static final Scope[] K = new Scope[0];
    public static final tw0[] L = new tw0[0];
    public IBinder A;
    public Scope[] B;
    public Bundle C;
    public Account D;
    public tw0[] E;
    public tw0[] F;
    public final boolean G;
    public final int H;
    public boolean I;
    public final String J;
    public final int w;
    public final int x;
    public final int y;
    public String z;

    public CQf(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, tw0[] tw0VarArr, tw0[] tw0VarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? K : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        tw0[] tw0VarArr3 = L;
        tw0VarArr = tw0VarArr == null ? tw0VarArr3 : tw0VarArr;
        tw0VarArr2 = tw0VarArr2 == null ? tw0VarArr3 : tw0VarArr2;
        this.w = i;
        this.x = i2;
        this.y = i3;
        if ("com.google.android.gms".equals(str)) {
            this.z = "com.google.android.gms";
        } else {
            this.z = str;
        }
        if (i < 2) {
            Account accountZzb = null;
            if (iBinder != null) {
                int i5 = IAccountAccessor.Stub.w;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IAccountAccessor zzvVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzv(iBinder);
                int i6 = AccountAccessor.x;
                if (zzvVar != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            accountZzb = zzvVar.zzb();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.D = accountZzb;
        } else {
            this.A = iBinder;
            this.D = account;
        }
        this.B = scopeArr;
        this.C = bundle;
        this.E = tw0VarArr;
        this.F = tw0VarArr2;
        this.G = z;
        this.H = i4;
        this.I = z2;
        this.J = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b47.a(this, parcel, i);
    }
}
