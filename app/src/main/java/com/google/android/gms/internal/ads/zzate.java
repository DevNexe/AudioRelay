package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzate {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final /* synthetic */ int zza = 0;

    public static int zza(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static zzass zzb(zzbag zzbagVar, String str, String str2, zzaur zzaurVar) {
        int i = b[(zzbagVar.zzg() & 192) >> 6];
        int iZzg = zzbagVar.zzg();
        int i2 = c[(iZzg & 56) >> 3];
        if ((iZzg & 4) != 0) {
            i2++;
        }
        return zzass.zzg(str, "audio/ac3", null, -1, -1, i2, i, null, zzaurVar, 0, str2);
    }

    public static zzass zzc(zzbag zzbagVar, String str, String str2, zzaur zzaurVar) {
        zzbagVar.zzw(2);
        int i = b[(zzbagVar.zzg() & 192) >> 6];
        int iZzg = zzbagVar.zzg();
        int i2 = c[(iZzg & 14) >> 1];
        if ((iZzg & 1) != 0) {
            i2++;
        }
        return zzass.zzg(str, "audio/eac3", null, -1, -1, i2, i, null, zzaurVar, 0, str2);
    }
}
