package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzu {
    public static final Pattern a = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    public final boolean a(String str) {
        Matcher matcher = a.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = zzel.zza;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.zza = i2;
            this.zzb = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzbq zzbqVar) {
        for (int i = 0; i < zzbqVar.zza(); i++) {
            zzbp zzbpVarZzb = zzbqVar.zzb(i);
            if (zzbpVarZzb instanceof zzact) {
                zzact zzactVar = (zzact) zzbpVarZzb;
                if ("iTunSMPB".equals(zzactVar.zzb) && a(zzactVar.zzc)) {
                    return true;
                }
            } else if (zzbpVarZzb instanceof zzadc) {
                zzadc zzadcVar = (zzadc) zzbpVarZzb;
                if ("com.apple.iTunes".equals(zzadcVar.zza) && "iTunSMPB".equals(zzadcVar.zzb) && a(zzadcVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
