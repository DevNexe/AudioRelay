package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.RestrictedInheritance;
import defpackage.Th;
import defpackage.ac;
import defpackage.l97;
import defpackage.oa3;
import defpackage.ra1;
import defpackage.s67;
import defpackage.sc7;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public final class QnHx {

    @Nullable
    public static QnHx c;
    public final Context a;
    public volatile String b;

    public QnHx(Context context) {
        this.a = context.getApplicationContext();
    }

    public static QnHx a(Context context) {
        oa3.h(context);
        synchronized (QnHx.class) {
            if (c == null) {
                zzh zzhVar = LPt8Fixed.a;
                synchronized (LPt8Fixed.class) {
                    if (LPt8Fixed.e == null) {
                        LPt8Fixed.e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                c = new QnHx(context);
            }
        }
        return c;
    }

    @Nullable
    public static final zzj c(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < zzjVarArr.length; i++) {
            if (zzjVarArr[i].equals(zzkVar)) {
                return zzjVarArr[i];
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo, boolean z) {
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? c(packageInfo, F1.a) : c(packageInfo, F1.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0161  */
    public final boolean b(int i) {
        sc7 sc7VarB;
        int length;
        boolean zZzi;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            sc7VarB = sc7.b("no pkgs");
        } else {
            sc7VarB = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    oa3.h(sc7VarB);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    sc7VarB = sc7.b("null pkg");
                } else if (str.equals(this.b)) {
                    sc7VarB = sc7.d;
                } else {
                    zzh zzhVar = LPt8Fixed.a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            LPt8Fixed.b();
                            zZzi = LPt8Fixed.c.zzi();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (RemoteException | DynamiteModule.LoadingException e) {
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            zZzi = false;
                        }
                        if (zZzi) {
                            boolean zA = ra1.a(this.a);
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                            try {
                                oa3.h(LPt8Fixed.e);
                                try {
                                    LPt8Fixed.b();
                                    try {
                                        l97 l97VarW = LPt8Fixed.c.W(new s67(str, zA, false, new ObjectWrapper(LPt8Fixed.e), false));
                                        if (l97VarW.w) {
                                            ac.p(l97VarW.z);
                                            sc7VarB = new sc7(true, null, null);
                                        } else {
                                            String str2 = l97VarW.x;
                                            PackageManager.NameNotFoundException nameNotFoundException = Th.O(l97VarW.y) == 4 ? new PackageManager.NameNotFoundException() : null;
                                            if (str2 == null) {
                                                str2 = "error checking package certificate";
                                            }
                                            ac.p(l97VarW.z);
                                            Th.O(l97VarW.y);
                                            sc7VarB = new sc7(false, str2, nameNotFoundException);
                                        }
                                    } catch (RemoteException e2) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                        sc7VarB = sc7.c("module call", e2);
                                    }
                                } catch (DynamiteModule.LoadingException e3) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                                    sc7VarB = sc7.c("module init: ".concat(String.valueOf(e3.getMessage())), e3);
                                }
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                            } catch (Throwable th) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                throw th;
                            }
                        } else {
                            try {
                                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 64);
                                boolean zA2 = ra1.a(this.a);
                                if (packageInfo == null) {
                                    sc7VarB = sc7.b("null pkg");
                                } else {
                                    Signature[] signatureArr = packageInfo.signatures;
                                    if (signatureArr == null || signatureArr.length != 1) {
                                        sc7VarB = sc7.b("single cert required");
                                    } else {
                                        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                                        String str3 = packageInfo.packageName;
                                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                        try {
                                            sc7 sc7VarA = LPt8Fixed.a(str3, zzkVar, zA2, false);
                                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                            if (sc7VarA.a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                try {
                                                    sc7 sc7VarA2 = LPt8Fixed.a(str3, zzkVar, false, true);
                                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                    if (sc7VarA2.a) {
                                                        sc7VarB = sc7.b("debuggable release cert app rejected");
                                                    }
                                                } catch (Throwable th2) {
                                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                    throw th2;
                                                }
                                            }
                                            sc7VarB = sc7VarA;
                                        } catch (Throwable th3) {
                                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                            throw th3;
                                        }
                                    }
                                }
                                if (sc7VarB.a) {
                                    this.b = str;
                                }
                            } catch (PackageManager.NameNotFoundException e4) {
                                sc7VarB = sc7.c("no pkg ".concat(str), e4);
                            }
                        }
                        if (sc7VarB.a) {
                            this.b = str;
                        }
                    } catch (Throwable th4) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th4;
                    }
                }
                if (sc7VarB.a) {
                    break;
                }
                i2++;
            }
        }
        if (!sc7VarB.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th5 = sc7VarB.c;
            if (th5 != null) {
                Log.d("GoogleCertificatesRslt", sc7VarB.a(), th5);
            } else {
                Log.d("GoogleCertificatesRslt", sc7VarB.a());
            }
        }
        return sc7VarB.a;
    }
}
