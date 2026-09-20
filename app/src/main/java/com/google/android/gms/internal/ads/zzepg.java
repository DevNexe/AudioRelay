package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzepg implements zzeun {
    public final zzeqx a;
    public final zzfdn b;
    public final Context c;
    public final zzcfw d;

    public zzepg(zzeqx zzeqxVar, zzfdn zzfdnVar, Context context, zzcfw zzcfwVar) {
        this.a = zzeqxVar;
        this.b = zzfdnVar;
        this.c = context;
        this.d = zzcfwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return zzfyo.zzm(this.a.zzb(), new zzfru() { // from class: com.google.android.gms.internal.ads.zzepf
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                String str;
                boolean z;
                String strZzm;
                float f;
                int i;
                int i2;
                int i3;
                DisplayMetrics displayMetrics;
                zzepg zzepgVar = this.zza;
                zzfdn zzfdnVar = zzepgVar.b;
                com.google.android.gms.ads.internal.client.zzq zzqVar = zzfdnVar.zze;
                com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = zzqVar.zzg;
                if (zzqVarArr != null) {
                    str = null;
                    boolean z2 = false;
                    boolean z3 = false;
                    z = false;
                    for (com.google.android.gms.ads.internal.client.zzq zzqVar2 : zzqVarArr) {
                        boolean z4 = zzqVar2.zzi;
                        if (!z4 && !z2) {
                            str = zzqVar2.zza;
                            z2 = true;
                        }
                        if (z4) {
                            if (z3) {
                                z3 = true;
                            } else {
                                z3 = true;
                                z = true;
                            }
                        }
                        if (z2 && z3) {
                            break;
                        }
                    }
                } else {
                    str = zzqVar.zza;
                    z = zzqVar.zzi;
                }
                Resources resources = zzepgVar.c.getResources();
                if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                    strZzm = null;
                    f = 0.0f;
                    i = 0;
                    i2 = 0;
                } else {
                    float f2 = displayMetrics.density;
                    i = displayMetrics.widthPixels;
                    int i4 = displayMetrics.heightPixels;
                    strZzm = zzepgVar.d.zzh().zzm();
                    i2 = i4;
                    f = f2;
                }
                StringBuilder sb = new StringBuilder();
                com.google.android.gms.ads.internal.client.zzq[] zzqVarArr2 = zzqVar.zzg;
                if (zzqVarArr2 != null) {
                    boolean z5 = false;
                    for (com.google.android.gms.ads.internal.client.zzq zzqVar3 : zzqVarArr2) {
                        if (zzqVar3.zzi) {
                            z5 = true;
                        } else {
                            if (sb.length() != 0) {
                                sb.append("|");
                            }
                            int i5 = zzqVar3.zze;
                            if (i5 == -1) {
                                i5 = f != 0.0f ? (int) (zzqVar3.zzf / f) : -1;
                            }
                            sb.append(i5);
                            sb.append("x");
                            int i6 = zzqVar3.zzb;
                            if (i6 == -2) {
                                i6 = f != 0.0f ? (int) (zzqVar3.zzc / f) : -2;
                            }
                            sb.append(i6);
                        }
                    }
                    if (z5) {
                        if (sb.length() != 0) {
                            i3 = 0;
                            sb.insert(0, "|");
                        } else {
                            i3 = 0;
                        }
                        sb.insert(i3, "320x50");
                    }
                }
                return new zzeph(zzqVar, str, z, sb.toString(), f, i, i2, strZzm, zzfdnVar.zzp);
            }
        }, zzcha.zzf);
    }
}
