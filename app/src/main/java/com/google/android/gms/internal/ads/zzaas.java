package com.google.android.gms.internal.ads;

import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaas {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static zzbq zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] strArrZzah = zzel.zzah(str, "=");
            if (strArrZzah.length != 2) {
                Log.w("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (strArrZzah[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzacf.zzb(new zzed(Base64.decode(strArrZzah[1], 0))));
                } catch (RuntimeException e) {
                    zzdu.zzb("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzadv(strArrZzah[0], strArrZzah[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq(arrayList);
    }

    public static zzaap zzc(zzed zzedVar, boolean z, boolean z2) throws zzbu {
        if (z) {
            zzd(3, zzedVar, false);
        }
        String strZzx = zzedVar.zzx((int) zzedVar.zzq(), zzfrs.zzc);
        long jZzq = zzedVar.zzq();
        String[] strArr = new String[(int) jZzq];
        int length = strZzx.length() + 15;
        for (int i = 0; i < jZzq; i++) {
            String strZzx2 = zzedVar.zzx((int) zzedVar.zzq(), zzfrs.zzc);
            strArr[i] = strZzx2;
            length = length + 4 + strZzx2.length();
        }
        if (z2 && (zzedVar.zzk() & 1) == 0) {
            throw zzbu.zza("framing bit expected to be set", null);
        }
        return new zzaap(strZzx, strArr, length + 1);
    }

    public static boolean zzd(int i, zzed zzedVar, boolean z) throws zzbu {
        if (zzedVar.zza() < 7) {
            if (z) {
                return false;
            }
            throw zzbu.zza("too short header: " + zzedVar.zza(), null);
        }
        if (zzedVar.zzk() != i) {
            if (z) {
                return false;
            }
            throw zzbu.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (zzedVar.zzk() == 118 && zzedVar.zzk() == 111 && zzedVar.zzk() == 114 && zzedVar.zzk() == 98 && zzedVar.zzk() == 105 && zzedVar.zzk() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzbu.zza("expected characters 'vorbis'", null);
    }
}
