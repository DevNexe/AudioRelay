package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import defpackage.ac7;
import defpackage.oa3;
import defpackage.sc7;
import defpackage.zc1;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class LPt8Fixed {
    public static final zzh a;
    public static final zzi b;
    public static volatile zzaf c;
    public static final Object d;
    public static Context e;

    static {
        new zzf(zzj.L0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new zzg(zzj.L0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new zzh(zzj.L0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new zzi(zzj.L0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        d = new Object();
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [com.google.android.gms.common.CQf] */
    public static sc7 a(final String str, final zzj zzjVar, final boolean z, boolean z2) {
        try {
            b();
            oa3.h(e);
            try {
                return c.i0(new NUlFixed(str, zzjVar, z, z2), new ObjectWrapper(e.getPackageManager())) ? sc7.d : new ac7(new Callable() { // from class: com.google.android.gms.common.CQf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        MessageDigest messageDigest;
                        boolean z3 = z;
                        String str2 = str;
                        zzj zzjVar2 = zzjVar;
                        Object[] objArr = new Object[5];
                        objArr[0] = true != (!z3 && LPt8Fixed.a(str2, zzjVar2, true, false).a) ? "not allowed" : "debug cert rejected";
                        objArr[1] = str2;
                        for (int i = 0; i < 2; i++) {
                            try {
                                messageDigest = MessageDigest.getInstance("SHA-256");
                                if (messageDigest != null) {
                                    oa3.h(messageDigest);
                                    objArr[2] = zc1.a(messageDigest.digest(zzjVar2.M0()));
                                    objArr[3] = Boolean.valueOf(z3);
                                    objArr[4] = "12451000.false";
                                    return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", objArr);
                                }
                            } catch (NoSuchAlgorithmException unused) {
                            }
                        }
                        messageDigest = null;
                        oa3.h(messageDigest);
                        objArr[2] = zc1.a(messageDigest.digest(zzjVar2.M0()));
                        objArr[3] = Boolean.valueOf(z3);
                        objArr[4] = "12451000.false";
                        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", objArr);
                    }
                });
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return sc7.c("module call", e2);
            }
        } catch (DynamiteModule.LoadingException e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return sc7.c("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    public static void b() {
        zzaf zzadVar;
        if (c != null) {
            return;
        }
        oa3.h(e);
        synchronized (d) {
            if (c == null) {
                IBinder iBinderB = DynamiteModule.c(e, DynamiteModule.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                int i = com.google.android.gms.common.internal.zzae.w;
                if (iBinderB == null) {
                    zzadVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    zzadVar = iInterfaceQueryLocalInterface instanceof zzaf ? (zzaf) iInterfaceQueryLocalInterface : new zzad(iBinderB);
                }
                c = zzadVar;
            }
        }
    }
}
