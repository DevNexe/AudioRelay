package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import defpackage.i76;

/* JADX INFO: loaded from: classes.dex */
public final class zzv extends zza implements IAccountAccessor {
    public zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account zzb() {
        Parcel parcelK0 = K0(L0(), 2);
        Account account = (Account) i76.a(parcelK0, Account.CREATOR);
        parcelK0.recycle();
        return account;
    }
}
