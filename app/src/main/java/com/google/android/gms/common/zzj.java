package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.oa3;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
abstract class zzj extends zzy {
    public final int x;

    public zzj(byte[] bArr) {
        oa3.b(bArr.length == 25);
        this.x = Arrays.hashCode(bArr);
    }

    public static byte[] L0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] M0();

    public final boolean equals(Object obj) {
        IObjectWrapper iObjectWrapperZzd;
        if (obj != null && (obj instanceof zzz)) {
            try {
                zzz zzzVar = (zzz) obj;
                if (zzzVar.zzc() == this.x && (iObjectWrapperZzd = zzzVar.zzd()) != null) {
                    return Arrays.equals(M0(), (byte[]) ObjectWrapper.M0(iObjectWrapperZzd));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.x;
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final int zzc() {
        return this.x;
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final IObjectWrapper zzd() {
        return new ObjectWrapper(M0());
    }
}
