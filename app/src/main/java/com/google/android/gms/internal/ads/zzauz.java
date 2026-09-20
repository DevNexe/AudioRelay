package com.google.android.gms.internal.ads;

import defpackage.xApe;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzauz {
    public int zzb = -1;
    public int zzc = -1;
    public static final zzaxi zza = new xApe();
    public static final Pattern a = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    public final boolean zza() {
        return (this.zzb == -1 || this.zzc == -1) ? false : true;
    }

    public final boolean zzb(zzaxd zzaxdVar) {
        for (int i = 0; i < zzaxdVar.zza(); i++) {
            zzaxc zzaxcVarZzb = zzaxdVar.zzb(i);
            if (zzaxcVarZzb instanceof zzaxh) {
                zzaxh zzaxhVar = (zzaxh) zzaxcVarZzb;
                String str = zzaxhVar.zzb;
                String str2 = zzaxhVar.zzc;
                if ("iTunSMPB".equals(str)) {
                    Matcher matcher = a.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int i2 = Integer.parseInt(matcher.group(1), 16);
                            int i3 = Integer.parseInt(matcher.group(2), 16);
                            if (i2 > 0 || i3 > 0) {
                                this.zzb = i2;
                                this.zzc = i3;
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }
}
