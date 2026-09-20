package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqo extends zzarm {
    public static final zzarn E = new zzarn();
    public final Context D;

    public zzaqo(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2, Context context, zzama zzamaVar) {
        super(zzaqbVar, "CL5CLQrzdJf7Vwsm6HGAxqUk+UMWsbN6k++UR113AdLOMpqSaLq8guKKFWwu33sx", "AU2/Ti/cc5wfSsdvyvo7rvRQAPyBVB0PKDRfRe8Q8Qo=", zzamhVar, i, 27);
        this.D = context;
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        int i;
        zzann zzannVar;
        AtomicReference atomicReferenceZza = E.zza(this.D.getPackageName());
        synchronized (atomicReferenceZza) {
            zzann zzannVar2 = (zzann) atomicReferenceZza.get();
            if (zzannVar2 == null || zzaqe.zzg(zzannVar2.zza) || zzannVar2.zza.equals("E") || zzannVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzaqe.zzg(null)) {
                    i = ((!zzaqe.zzg(null) ? Boolean.FALSE : Boolean.FALSE).booleanValue() && this.w.zzp()) ? 4 : 3;
                } else {
                    i = 5;
                }
                Boolean boolValueOf = Boolean.valueOf(i == 3);
                Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbW);
                String strB = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbV)).booleanValue() ? b() : null;
                if (bool.booleanValue() && this.w.zzp() && zzaqe.zzg(strB)) {
                    strB = c();
                }
                zzann zzannVar3 = new zzann((String) this.A.invoke(null, this.D, boolValueOf, strB));
                if (zzaqe.zzg(zzannVar3.zza) || zzannVar3.zza.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String strC = c();
                        if (!zzaqe.zzg(strC)) {
                            zzannVar3.zza = strC;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                atomicReferenceZza.set(zzannVar3);
            }
            zzannVar = (zzann) atomicReferenceZza.get();
        }
        synchronized (this.z) {
            if (zzannVar != null) {
                this.z.zzw(zzannVar.zza);
                this.z.zzW(zzannVar.zzb);
                this.z.zzY(zzannVar.zzc);
                this.z.zzh(zzannVar.zzd);
                this.z.zzv(zzannVar.zze);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.zzaro] */
    public final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrZzi = zzaqe.zzi((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbX));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzi)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzaqe.zzi((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbY)))));
            }
            Context context = this.D;
            String packageName = context.getPackageName();
            this.w.zzk();
            if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
                final zzfzg zzfzgVarZzf = zzfzg.zzf();
                context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaro
                    public final void onChecksumsReady(List list) {
                        zzfzg zzfzgVar = zzfzgVarZzf;
                        if (list == null) {
                            zzfzgVar.zzd(null);
                            return;
                        }
                        try {
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                                if (apkChecksum.getType() == 8) {
                                    zzfzgVar.zzd(zzaqe.zzc(apkChecksum.getValue()));
                                    return;
                                }
                            }
                            zzfzgVar.zzd(null);
                        } catch (Throwable unused) {
                            zzfzgVar.zzd(null);
                        }
                    }
                });
                return (String) zzfzgVarZzf.get();
            }
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
        }
        return null;
    }

    public final String c() {
        zzaqb zzaqbVar = this.w;
        try {
            if (zzaqbVar.zzl() != null) {
                zzaqbVar.zzl().get();
            }
            zzamx zzamxVarZzc = zzaqbVar.zzc();
            if (zzamxVarZzc == null || !zzamxVarZzc.zzai()) {
                return null;
            }
            return zzamxVarZzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
