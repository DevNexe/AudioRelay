package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import defpackage.zc1;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfnu {
    public final File a;
    public final File b;
    public final SharedPreferences c;
    public final int d;

    public zzfnu(Context context, int i) {
        this.c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfnv.zza(dir, false);
        this.a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfnv.zza(dir2, true);
        this.b = dir2;
        this.d = i;
    }

    public final zzaru a(int i) {
        String string;
        int i2 = this.d;
        SharedPreferences sharedPreferences = this.c;
        if (i == 1) {
            StringBuilder sb = new StringBuilder("LATMTD");
            sb.append(i2 - 1);
            string = sharedPreferences.getString(sb.toString(), null);
        } else {
            StringBuilder sb2 = new StringBuilder("FBAMTD");
            sb2.append(i2 - 1);
            string = sharedPreferences.getString(sb2.toString(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            zzaru zzaruVarZzh = zzaru.zzh(zzgnf.zzv(zc1.f(string)));
            String strZzk = zzaruVarZzh.zzk();
            File fileZzb = zzfnv.zzb(strZzk, "pcam.jar", b());
            if (!fileZzb.exists()) {
                fileZzb = zzfnv.zzb(strZzk, "pcam", b());
            }
            File fileZzb2 = zzfnv.zzb(strZzk, "pcbc", b());
            if (fileZzb.exists() && fileZzb2.exists()) {
                return zzaruVarZzh;
            }
            return null;
        } catch (zzgoz unused) {
        }
    }

    public final File b() {
        File file = new File(this.a, Integer.toString(this.d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0154  */
    public final boolean zzb(zzarr zzarrVar, zzfoa zzfoaVar) {
        boolean z;
        String strZzk = zzarrVar.zzd().zzk();
        byte[] bArrZzE = zzarrVar.zzf().zzE();
        byte[] bArrZzE2 = zzarrVar.zze().zzE();
        if (!TextUtils.isEmpty(strZzk) && bArrZzE2 != null && bArrZzE2.length != 0) {
            File file = this.b;
            zzfnv.zzd(file);
            file.mkdirs();
            zzfnv.zzc(strZzk, file).mkdirs();
            File fileZzb = zzfnv.zzb(strZzk, "pcam.jar", file);
            if ((bArrZzE == null || bArrZzE.length <= 0 || zzfnv.zze(fileZzb, bArrZzE)) && zzfnv.zze(zzfnv.zzb(strZzk, "pcbc", file), bArrZzE2)) {
                File fileZzb2 = zzfnv.zzb(zzarrVar.zzd().zzk(), "pcam.jar", file);
                if (fileZzb2.exists() && zzfoaVar != null && !zzfoaVar.zza(fileZzb2)) {
                    return false;
                }
                String strZzk2 = zzarrVar.zzd().zzk();
                if (TextUtils.isEmpty(strZzk2)) {
                    z = false;
                } else {
                    File fileZzb3 = zzfnv.zzb(strZzk2, "pcam.jar", file);
                    File fileZzb4 = zzfnv.zzb(strZzk2, "pcbc", file);
                    File fileZzb5 = zzfnv.zzb(strZzk2, "pcam.jar", b());
                    File fileZzb6 = zzfnv.zzb(strZzk2, "pcbc", b());
                    if ((!fileZzb3.exists() || fileZzb3.renameTo(fileZzb5)) && fileZzb4.exists() && fileZzb4.renameTo(fileZzb6)) {
                        zzart zzartVarZze = zzaru.zze();
                        zzartVarZze.zze(zzarrVar.zzd().zzk());
                        zzartVarZze.zza(zzarrVar.zzd().zzj());
                        zzartVarZze.zzb(zzarrVar.zzd().zza());
                        zzartVarZze.zzd(zzarrVar.zzd().zzd());
                        zzartVarZze.zzc(zzarrVar.zzd().zzc());
                        zzaru zzaruVar = (zzaru) zzartVarZze.zzal();
                        zzaru zzaruVarA = a(1);
                        SharedPreferences.Editor editorEdit = this.c.edit();
                        int i = this.d;
                        if (zzaruVarA != null && !zzaruVar.zzk().equals(zzaruVarA.zzk())) {
                            StringBuilder sb = new StringBuilder("FBAMTD");
                            sb.append(i - 1);
                            editorEdit.putString(sb.toString(), zc1.a(zzaruVarA.zzas().zzE()));
                        }
                        StringBuilder sb2 = new StringBuilder("LATMTD");
                        sb2.append(i - 1);
                        editorEdit.putString(sb2.toString(), zc1.a(zzaruVar.zzas().zzE()));
                        if (editorEdit.commit()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                HashSet hashSet = new HashSet();
                zzaru zzaruVarA2 = a(1);
                if (zzaruVarA2 != null) {
                    hashSet.add(zzaruVarA2.zzk());
                }
                zzaru zzaruVarA3 = a(2);
                if (zzaruVarA3 != null) {
                    hashSet.add(zzaruVarA3.zzk());
                }
                for (File file2 : b().listFiles()) {
                    String name = file2.getName();
                    if (!hashSet.contains(name)) {
                        zzfnv.zzd(zzfnv.zzc(name, b()));
                    }
                }
                return z;
            }
        }
        return false;
    }

    public final zzfnt zzd(int i) {
        zzaru zzaruVarA = a(1);
        if (zzaruVarA == null) {
            return null;
        }
        String strZzk = zzaruVarA.zzk();
        File fileZzb = zzfnv.zzb(strZzk, "pcam.jar", b());
        if (!fileZzb.exists()) {
            fileZzb = zzfnv.zzb(strZzk, "pcam", b());
        }
        return new zzfnt(zzaruVarA, fileZzb, zzfnv.zzb(strZzk, "pcbc", b()), zzfnv.zzb(strZzk, "pcopt", b()));
    }
}
