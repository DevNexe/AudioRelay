package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaee {
    public int a;
    public byte[] zzM;
    public zzaan zzS;
    public boolean zzT;
    public zzaam zzV;
    public int zzW;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzaal zzi;
    public byte[] zzj;
    public zzx zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = AdError.NETWORK_ERROR_CODE;
    public int zzB = RCHTTPStatusCodes.SUCCESS;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = 8000;
    public long zzQ = 0;
    public long zzR = 0;
    public boolean zzU = true;
    public String b = "eng";

    @EnsuresNonNull({"codecPrivate"})
    public final byte[] a(String str) throws zzbu {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbu.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x0196  */
    /* JADX WARN: Code duplicated, block: B:128:0x0242 A[PHI: r10
  0x0242: PHI (r10v5 int) = (r10v1 int), (r10v2 int), (r10v3 int), (r10v0 int) binds: [B:144:0x0286, B:126:0x0229, B:123:0x020a, B:116:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x0256  */
    /* JADX WARN: Code duplicated, block: B:239:0x049a  */
    /* JADX WARN: Code duplicated, block: B:244:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:245:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:248:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:249:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:251:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:253:0x04da  */
    /* JADX WARN: Code duplicated, block: B:255:0x04df  */
    /* JADX WARN: Code duplicated, block: B:258:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:260:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:263:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:266:0x0503  */
    /* JADX WARN: Code duplicated, block: B:269:0x0509  */
    /* JADX WARN: Code duplicated, block: B:271:0x050f  */
    /* JADX WARN: Code duplicated, block: B:294:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:296:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:299:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:318:0x063d  */
    /* JADX WARN: Code duplicated, block: B:320:0x065c  */
    /* JADX WARN: Code duplicated, block: B:322:0x0664  */
    /* JADX WARN: Code duplicated, block: B:338:0x0699  */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    public final void zze(zzzi zzziVar, int i) {
        byte b;
        List list;
        String str;
        String str2;
        List list2;
        Pair pair;
        int i2;
        ArrayList arrayList;
        List list3;
        boolean z;
        List list4;
        byte[] bArr;
        String str3;
        int i3;
        zzad zzadVar;
        int iIntValue;
        int i4;
        float f;
        String str4;
        Map map;
        int i5;
        int i6;
        int i7;
        String str5;
        zzzb zzzbVarZza;
        List listSingletonList;
        String str6 = this.zzb;
        int iZzn = 4;
        int i8 = 2;
        int i9 = 0;
        switch (str6) {
            case "V_MPEG4/ISO/AP":
                b = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b = 4;
                break;
            case "A_MS/ACM":
                b = 23;
                break;
            case "A_TRUEHD":
                b = 18;
                break;
            case "A_VORBIS":
                b = 11;
                break;
            case "A_MPEG/L2":
                b = 14;
                break;
            case "A_MPEG/L3":
                b = 15;
                break;
            case "V_MS/VFW/FOURCC":
                b = 9;
                break;
            case "S_DVBSUB":
                b = 32;
                break;
            case "V_MPEG4/ISO/ASP":
                b = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b = 7;
                break;
            case "S_VOBSUB":
                b = 30;
                break;
            case "A_DTS/LOSSLESS":
                b = 21;
                break;
            case "A_AAC":
                b = 13;
                break;
            case "A_AC3":
                b = 16;
                break;
            case "A_DTS":
                b = 19;
                break;
            case "V_AV1":
                b = 2;
                break;
            case "V_VP8":
                b = 0;
                break;
            case "V_VP9":
                b = 1;
                break;
            case "S_HDMV/PGS":
                b = 31;
                break;
            case "V_THEORA":
                b = 10;
                break;
            case "A_DTS/EXPRESS":
                b = 20;
                break;
            case "A_PCM/FLOAT/IEEE":
                b = 26;
                break;
            case "A_PCM/INT/BIG":
                b = 25;
                break;
            case "A_PCM/INT/LIT":
                b = 24;
                break;
            case "S_TEXT/ASS":
                b = 28;
                break;
            case "V_MPEGH/ISO/HEVC":
                b = 8;
                break;
            case "S_TEXT/WEBVTT":
                b = 29;
                break;
            case "S_TEXT/UTF8":
                b = 27;
                break;
            case "V_MPEG2":
                b = 3;
                break;
            case "A_EAC3":
                b = 17;
                break;
            case "A_FLAC":
                b = 22;
                break;
            case "A_OPUS":
                b = 12;
                break;
            default:
                b = -1;
                break;
        }
        String str7 = "audio/raw";
        zzq zzqVar = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        byte[] bArr2 = null;
        switch (b) {
            case 0:
                str7 = "video/x-vnd.on2.vp8";
                list2 = null;
                str2 = null;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null && (zzzbVarZza = zzzb.zza(new zzed(bArr))) != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z2 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i10 = (z2 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                } else if (zzbt.zzh(str3)) {
                    if (this.zzp == 0) {
                        i6 = this.zzn;
                        iIntValue = -1;
                        if (i6 == -1) {
                            i6 = this.zzl;
                        }
                        this.zzn = i6;
                        i7 = this.zzo;
                        if (i7 == -1) {
                            i7 = this.zzm;
                        }
                        this.zzo = i7;
                    } else {
                        iIntValue = -1;
                    }
                    i4 = this.zzn;
                    if (i4 != iIntValue || (i5 = this.zzo) == iIntValue) {
                        f = -1.0f;
                    } else {
                        f = (this.zzm * i4) / (this.zzl * i5);
                    }
                    if (this.zzw) {
                        if (this.zzC != -1.0f && this.zzD != -1.0f && this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f) {
                            bArr2 = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzK + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzL + 0.5f));
                            byteBufferOrder.putShort((short) this.zzA);
                            byteBufferOrder.putShort((short) this.zzB);
                        }
                        zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                    }
                    str4 = this.zza;
                    if (str4 != null) {
                        map = zzaef.h0;
                        if (map.containsKey(str4)) {
                            iIntValue = ((Integer) map.get(this.zza)).intValue();
                        }
                    }
                    if (this.zzq == 0 || Float.compare(this.zzr, 0.0f) != 0 || Float.compare(this.zzs, 0.0f) != 0) {
                        i9 = iIntValue;
                    } else if (Float.compare(this.zzt, 0.0f) != 0) {
                        if (Float.compare(this.zzs, 90.0f) == 0) {
                            i9 = 90;
                        } else if (Float.compare(this.zzs, -180.0f) == 0 || Float.compare(this.zzs, 180.0f) == 0) {
                            i9 = 180;
                        } else if (Float.compare(this.zzs, -90.0f) == 0) {
                            i9 = 270;
                        } else {
                            i9 = iIntValue;
                        }
                    }
                    zzadVar.zzX(this.zzl);
                    zzadVar.zzF(this.zzm);
                    zzadVar.zzP(f);
                    zzadVar.zzR(i9);
                    zzadVar.zzQ(this.zzu);
                    zzadVar.zzV(this.zzv);
                    zzadVar.zzy(zzqVar);
                } else {
                    if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw zzbu.zza("Unexpected MIME type.", null);
                    }
                    i8 = 3;
                }
                str5 = this.zza;
                if (str5 != null && !zzaef.h0.containsKey(str5)) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i10);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY = zzadVar.zzY();
                zzaam zzaamVarZzv = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv;
                zzaamVarZzv.zzk(zzafVarZzY);
                return;
            case 1:
                str7 = "video/x-vnd.on2.vp9";
                list2 = null;
                str2 = null;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z3 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i11 = (z3 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder2.put((byte) 0);
                                byteBufferOrder2.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder2.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder2.putShort((short) this.zzA);
                                byteBufferOrder2.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i11);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY2 = zzadVar.zzY();
                zzaam zzaamVarZzv2 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv2;
                zzaamVarZzv2.zzk(zzafVarZzY2);
                return;
            case 2:
                str7 = "video/av01";
                list2 = null;
                str2 = null;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z4 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i12 = (z4 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder3 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder3.put((byte) 0);
                                byteBufferOrder3.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder3.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder3.putShort((short) this.zzA);
                                byteBufferOrder3.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i12);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY3 = zzadVar.zzY();
                zzaam zzaamVarZzv3 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv3;
                zzaamVarZzv3.zzk(zzafVarZzY3);
                return;
            case 3:
                str7 = "video/mpeg2";
                list2 = null;
                str2 = null;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z5 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i13 = (z5 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder4 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder4.put((byte) 0);
                                byteBufferOrder4.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder4.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder4.putShort((short) this.zzA);
                                byteBufferOrder4.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i13);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY4 = zzadVar.zzY();
                zzaam zzaamVarZzv4 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv4;
                zzaamVarZzv4.zzk(zzafVarZzY4);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr3 = this.zzj;
                str7 = "video/mp4v-es";
                listSingletonList = bArr3 == null ? null : Collections.singletonList(bArr3);
                str2 = null;
                list2 = listSingletonList;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z6 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i14 = (z6 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder5 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder5.put((byte) 0);
                                byteBufferOrder5.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder5.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder5.putShort((short) this.zzA);
                                byteBufferOrder5.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i14);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY5 = zzadVar.zzY();
                zzaam zzaamVarZzv5 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv5;
                zzaamVarZzv5.zzk(zzafVarZzY5);
                return;
            case 7:
                zzyk zzykVarZza = zzyk.zza(new zzed(a(str6)));
                list = zzykVarZza.zza;
                this.zzW = zzykVarZza.zzb;
                str = zzykVarZza.zzf;
                str7 = "video/avc";
                str2 = str;
                list2 = list;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z7 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i15 = (z7 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder6 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder6.put((byte) 0);
                                byteBufferOrder6.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder6.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder6.putShort((short) this.zzA);
                                byteBufferOrder6.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i15);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY6 = zzadVar.zzY();
                zzaam zzaamVarZzv6 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv6;
                zzaamVarZzv6.zzk(zzafVarZzY6);
                return;
            case 8:
                zzzv zzzvVarZza = zzzv.zza(new zzed(a(str6)));
                list = zzzvVarZza.zza;
                this.zzW = zzzvVarZza.zzb;
                str = zzzvVarZza.zzd;
                str7 = "video/hevc";
                str2 = str;
                list2 = list;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z8 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i16 = (z8 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder7 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder7.put((byte) 0);
                                byteBufferOrder7.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder7.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder7.putShort((short) this.zzA);
                                byteBufferOrder7.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i16);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY7 = zzadVar.zzY();
                zzaam zzaamVarZzv7 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv7;
                zzaamVarZzv7.zzk(zzafVarZzY7);
                return;
            case 9:
                zzed zzedVar = new zzed(a(str6));
                try {
                    zzedVar.zzG(16);
                    long jZzq = zzedVar.zzq();
                    if (jZzq == 1482049860) {
                        pair = new Pair("video/divx", null);
                    } else if (jZzq == 859189832) {
                        pair = new Pair("video/3gpp", null);
                    } else if (jZzq == 826496599) {
                        int iZzc = zzedVar.zzc() + 20;
                        byte[] bArrZzH = zzedVar.zzH();
                        while (true) {
                            int length = bArrZzH.length;
                            if (iZzc >= length - 4) {
                                throw zzbu.zza("Failed to find FourCC VC1 initialization data", null);
                            }
                            if (bArrZzH[iZzc] == 0 && bArrZzH[iZzc + 1] == 0 && bArrZzH[iZzc + 2] == 1) {
                                if (bArrZzH[iZzc + 3] == 15) {
                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzH, iZzc, length)));
                                }
                            }
                            iZzc++;
                        }
                    } else {
                        Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                        pair = new Pair("video/x-unknown", null);
                    }
                    str7 = (String) pair.first;
                    listSingletonList = (List) pair.second;
                    str2 = null;
                    list2 = listSingletonList;
                    i2 = -1;
                    list3 = list2;
                    iZzn = -1;
                    list4 = list3;
                    bArr = this.zzM;
                    if (bArr != null) {
                        str2 = zzzbVarZza.zza;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    boolean z9 = this.zzU;
                    if (true != this.zzT) {
                        i3 = 0;
                    } else {
                        i3 = 2;
                    }
                    int i17 = (z9 ? 1 : 0) | i3;
                    zzadVar = new zzad();
                    if (zzbt.zzg(str3)) {
                        if (zzbt.zzh(str3)) {
                            if (this.zzp == 0) {
                                i6 = this.zzn;
                                iIntValue = -1;
                                if (i6 == -1) {
                                    i6 = this.zzl;
                                }
                                this.zzn = i6;
                                i7 = this.zzo;
                                if (i7 == -1) {
                                    i7 = this.zzm;
                                }
                                this.zzo = i7;
                            } else {
                                iIntValue = -1;
                            }
                            i4 = this.zzn;
                            if (i4 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.zzw) {
                                if (this.zzC != -1.0f) {
                                    bArr2 = new byte[25];
                                    ByteBuffer byteBufferOrder8 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder8.put((byte) 0);
                                    byteBufferOrder8.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                    byteBufferOrder8.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                    byteBufferOrder8.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                    byteBufferOrder8.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                    byteBufferOrder8.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                    byteBufferOrder8.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                    byteBufferOrder8.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                    byteBufferOrder8.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                    byteBufferOrder8.putShort((short) (this.zzK + 0.5f));
                                    byteBufferOrder8.putShort((short) (this.zzL + 0.5f));
                                    byteBufferOrder8.putShort((short) this.zzA);
                                    byteBufferOrder8.putShort((short) this.zzB);
                                }
                                zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                            }
                            str4 = this.zza;
                            if (str4 != null) {
                                map = zzaef.h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(this.zza)).intValue();
                                }
                            }
                            if (this.zzq == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            zzadVar.zzX(this.zzl);
                            zzadVar.zzF(this.zzm);
                            zzadVar.zzP(f);
                            zzadVar.zzR(i9);
                            zzadVar.zzQ(this.zzu);
                            zzadVar.zzV(this.zzv);
                            zzadVar.zzy(zzqVar);
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i8 = 3;
                        }
                        break;
                    } else {
                        zzadVar.zzw(this.zzN);
                        zzadVar.zzT(this.zzP);
                        zzadVar.zzN(iZzn);
                        i8 = 1;
                    }
                    str5 = this.zza;
                    if (str5 != null) {
                        zzadVar.zzJ(this.zza);
                    }
                    zzadVar.zzG(i);
                    zzadVar.zzS(str3);
                    zzadVar.zzL(i2);
                    zzadVar.zzK(this.b);
                    zzadVar.zzU(i17);
                    zzadVar.zzI(list4);
                    zzadVar.zzx(str2);
                    zzadVar.zzB(this.zzk);
                    zzaf zzafVarZzY8 = zzadVar.zzY();
                    zzaam zzaamVarZzv8 = zzziVar.zzv(this.zzc, i8);
                    this.zzV = zzaamVarZzv8;
                    zzaamVarZzv8.zzk(zzafVarZzY8);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw zzbu.zza("Error parsing FourCC private data", null);
                }
            case 10:
                str7 = "video/x-unknown";
                list2 = null;
                str2 = null;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z10 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i18 = (z10 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder9 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder9.put((byte) 0);
                                byteBufferOrder9.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder9.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder9.putShort((short) this.zzA);
                                byteBufferOrder9.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i18);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY9 = zzadVar.zzY();
                zzaam zzaamVarZzv9 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv9;
                zzaamVarZzv9.zzk(zzafVarZzY9);
                return;
            case 11:
                byte[] bArrA = a(str6);
                try {
                    if (bArrA[0] != 2) {
                        throw zzbu.zza("Error parsing vorbis codec private", null);
                    }
                    int i19 = 1;
                    int i20 = 0;
                    while (true) {
                        int i21 = bArrA[i19] & 255;
                        if (i21 == 255) {
                            i20 += 255;
                            i19++;
                        } else {
                            int i22 = i19 + 1;
                            int i23 = i20 + i21;
                            int i24 = 0;
                            while (true) {
                                int i25 = bArrA[i22] & 255;
                                if (i25 != 255) {
                                    int i26 = i22 + 1;
                                    int i27 = i24 + i25;
                                    if (bArrA[i26] != 1) {
                                        throw zzbu.zza("Error parsing vorbis codec private", null);
                                    }
                                    byte[] bArr4 = new byte[i23];
                                    System.arraycopy(bArrA, i26, bArr4, 0, i23);
                                    int i28 = i26 + i23;
                                    if (bArrA[i28] != 3) {
                                        throw zzbu.zza("Error parsing vorbis codec private", null);
                                    }
                                    int i29 = i28 + i27;
                                    if (bArrA[i29] != 5) {
                                        throw zzbu.zza("Error parsing vorbis codec private", null);
                                    }
                                    int length2 = bArrA.length - i29;
                                    byte[] bArr5 = new byte[length2];
                                    System.arraycopy(bArrA, i29, bArr5, 0, length2);
                                    ArrayList arrayList2 = new ArrayList(2);
                                    arrayList2.add(bArr4);
                                    arrayList2.add(bArr5);
                                    str7 = "audio/vorbis";
                                    i2 = 8192;
                                    arrayList = arrayList2;
                                    str2 = null;
                                    list3 = arrayList;
                                    iZzn = -1;
                                    list4 = list3;
                                    bArr = this.zzM;
                                    if (bArr != null) {
                                        str2 = zzzbVarZza.zza;
                                        str7 = "video/dolby-vision";
                                    }
                                    str3 = str7;
                                    boolean z11 = this.zzU;
                                    if (true != this.zzT) {
                                        i3 = 0;
                                    } else {
                                        i3 = 2;
                                    }
                                    int i110 = (z11 ? 1 : 0) | i3;
                                    zzadVar = new zzad();
                                    if (zzbt.zzg(str3)) {
                                        if (zzbt.zzh(str3)) {
                                            if (this.zzp == 0) {
                                                i6 = this.zzn;
                                                iIntValue = -1;
                                                if (i6 == -1) {
                                                    i6 = this.zzl;
                                                }
                                                this.zzn = i6;
                                                i7 = this.zzo;
                                                if (i7 == -1) {
                                                    i7 = this.zzm;
                                                }
                                                this.zzo = i7;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            i4 = this.zzn;
                                            if (i4 != iIntValue) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (this.zzw) {
                                                if (this.zzC != -1.0f) {
                                                    bArr2 = new byte[25];
                                                    ByteBuffer byteBufferOrder10 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                                    byteBufferOrder10.put((byte) 0);
                                                    byteBufferOrder10.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                                    byteBufferOrder10.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                                    byteBufferOrder10.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                                    byteBufferOrder10.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                                    byteBufferOrder10.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                                    byteBufferOrder10.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                                    byteBufferOrder10.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                                    byteBufferOrder10.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                                    byteBufferOrder10.putShort((short) (this.zzK + 0.5f));
                                                    byteBufferOrder10.putShort((short) (this.zzL + 0.5f));
                                                    byteBufferOrder10.putShort((short) this.zzA);
                                                    byteBufferOrder10.putShort((short) this.zzB);
                                                }
                                                zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                                            }
                                            str4 = this.zza;
                                            if (str4 != null) {
                                                map = zzaef.h0;
                                                if (map.containsKey(str4)) {
                                                    iIntValue = ((Integer) map.get(this.zza)).intValue();
                                                }
                                            }
                                            if (this.zzq == 0) {
                                                i9 = iIntValue;
                                            } else {
                                                i9 = iIntValue;
                                            }
                                            zzadVar.zzX(this.zzl);
                                            zzadVar.zzF(this.zzm);
                                            zzadVar.zzP(f);
                                            zzadVar.zzR(i9);
                                            zzadVar.zzQ(this.zzu);
                                            zzadVar.zzV(this.zzv);
                                            zzadVar.zzy(zzqVar);
                                        } else {
                                            if ("application/x-subrip".equals(str3)) {
                                            }
                                            i8 = 3;
                                        }
                                        break;
                                    } else {
                                        zzadVar.zzw(this.zzN);
                                        zzadVar.zzT(this.zzP);
                                        zzadVar.zzN(iZzn);
                                        i8 = 1;
                                    }
                                    str5 = this.zza;
                                    if (str5 != null) {
                                        zzadVar.zzJ(this.zza);
                                    }
                                    zzadVar.zzG(i);
                                    zzadVar.zzS(str3);
                                    zzadVar.zzL(i2);
                                    zzadVar.zzK(this.b);
                                    zzadVar.zzU(i110);
                                    zzadVar.zzI(list4);
                                    zzadVar.zzx(str2);
                                    zzadVar.zzB(this.zzk);
                                    zzaf zzafVarZzY10 = zzadVar.zzY();
                                    zzaam zzaamVarZzv10 = zzziVar.zzv(this.zzc, i8);
                                    this.zzV = zzaamVarZzv10;
                                    zzaamVarZzv10.zzk(zzafVarZzY10);
                                    return;
                                }
                                i24 += 255;
                                i22++;
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    throw zzbu.zza("Error parsing vorbis codec private", null);
                }
                break;
            case 12:
                ArrayList arrayList3 = new ArrayList(3);
                arrayList3.add(a(this.zzb));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(this.zzQ).array());
                arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzR).array());
                str7 = "audio/opus";
                i2 = 5760;
                arrayList = arrayList3;
                str2 = null;
                list3 = arrayList;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z12 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i111 = (z12 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder11 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder11.put((byte) 0);
                                byteBufferOrder11.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder11.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder11.putShort((short) this.zzA);
                                byteBufferOrder11.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i111);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY11 = zzadVar.zzY();
                zzaam zzaamVarZzv11 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv11;
                zzaamVarZzv11.zzk(zzafVarZzY11);
                return;
            case 13:
                List listSingletonList2 = Collections.singletonList(a(str6));
                zzyc zzycVarZza = zzyd.zza(this.zzj);
                this.zzP = zzycVarZza.zza;
                this.zzN = zzycVarZza.zzb;
                str7 = "audio/mp4a-latm";
                str2 = zzycVarZza.zzc;
                list2 = listSingletonList2;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z13 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i112 = (z13 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder12 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder12.put((byte) 0);
                                byteBufferOrder12.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder12.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder12.putShort((short) this.zzA);
                                byteBufferOrder12.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i112);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY12 = zzadVar.zzY();
                zzaam zzaamVarZzv12 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv12;
                zzaamVarZzv12.zzk(zzafVarZzY12);
                return;
            case 14:
                str7 = "audio/mpeg-L2";
                list3 = null;
                str2 = null;
                i2 = 4096;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z14 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i113 = (z14 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder13 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder13.put((byte) 0);
                                byteBufferOrder13.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder13.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder13.putShort((short) this.zzA);
                                byteBufferOrder13.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i113);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY13 = zzadVar.zzY();
                zzaam zzaamVarZzv13 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv13;
                zzaamVarZzv13.zzk(zzafVarZzY13);
                return;
            case 15:
                str7 = "audio/mpeg";
                list3 = null;
                str2 = null;
                i2 = 4096;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z15 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i114 = (z15 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder14 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder14.put((byte) 0);
                                byteBufferOrder14.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder14.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder14.putShort((short) this.zzA);
                                byteBufferOrder14.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i114);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY14 = zzadVar.zzY();
                zzaam zzaamVarZzv14 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv14;
                zzaamVarZzv14.zzk(zzafVarZzY14);
                return;
            case 16:
                str7 = "audio/ac3";
                list2 = null;
                str2 = null;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z16 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i115 = (z16 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder15 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder15.put((byte) 0);
                                byteBufferOrder15.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder15.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder15.putShort((short) this.zzA);
                                byteBufferOrder15.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i115);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY15 = zzadVar.zzY();
                zzaam zzaamVarZzv15 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv15;
                zzaamVarZzv15.zzk(zzafVarZzY15);
                return;
            case 17:
                str7 = "audio/eac3";
                list2 = null;
                str2 = null;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z17 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i116 = (z17 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder16 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder16.put((byte) 0);
                                byteBufferOrder16.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder16.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder16.putShort((short) this.zzA);
                                byteBufferOrder16.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i116);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY16 = zzadVar.zzY();
                zzaam zzaamVarZzv16 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv16;
                zzaamVarZzv16.zzk(zzafVarZzY16);
                return;
            case 18:
                this.zzS = new zzaan();
                str7 = "audio/true-hd";
                list2 = null;
                str2 = null;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z18 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i117 = (z18 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder17 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder17.put((byte) 0);
                                byteBufferOrder17.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder17.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder17.putShort((short) this.zzA);
                                byteBufferOrder17.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i117);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY17 = zzadVar.zzY();
                zzaam zzaamVarZzv17 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv17;
                zzaamVarZzv17.zzk(zzafVarZzY17);
                return;
            case 19:
            case 20:
                str7 = "audio/vnd.dts";
                list2 = null;
                str2 = null;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z19 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i118 = (z19 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder18 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder18.put((byte) 0);
                                byteBufferOrder18.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder18.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder18.putShort((short) this.zzA);
                                byteBufferOrder18.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i118);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY18 = zzadVar.zzY();
                zzaam zzaamVarZzv18 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv18;
                zzaamVarZzv18.zzk(zzafVarZzY18);
                return;
            case 21:
                str7 = "audio/vnd.dts.hd";
                list2 = null;
                str2 = null;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z110 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i119 = (z110 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder19 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder19.put((byte) 0);
                                byteBufferOrder19.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder19.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder19.putShort((short) this.zzA);
                                byteBufferOrder19.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i119);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY19 = zzadVar.zzY();
                zzaam zzaamVarZzv19 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv19;
                zzaamVarZzv19.zzk(zzafVarZzY19);
                return;
            case 22:
                str7 = "audio/flac";
                listSingletonList = Collections.singletonList(a(str6));
                str2 = null;
                list2 = listSingletonList;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z111 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1110 = (z111 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder110 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder110.put((byte) 0);
                                byteBufferOrder110.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder110.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder110.putShort((short) this.zzA);
                                byteBufferOrder110.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i1110);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY110 = zzadVar.zzY();
                zzaam zzaamVarZzv110 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv110;
                zzaamVarZzv110.zzk(zzafVarZzY110);
                return;
            case 23:
                zzed zzedVar2 = new zzed(a(str6));
                try {
                    int iZzi = zzedVar2.zzi();
                    if (iZzi != 1) {
                        if (iZzi == 65534) {
                            zzedVar2.zzF(24);
                            long jZzr = zzedVar2.zzr();
                            UUID uuid = zzaef.g0;
                            if (jZzr == uuid.getMostSignificantBits() && zzedVar2.zzr() == uuid.getLeastSignificantBits()) {
                                z = true;
                            }
                        }
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        iZzn = zzel.zzn(this.zzO);
                        if (iZzn == 0) {
                            Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                        } else {
                            list4 = null;
                            str2 = null;
                            i2 = -1;
                        }
                        bArr = this.zzM;
                        if (bArr != null) {
                            str2 = zzzbVarZza.zza;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z112 = this.zzU;
                        if (true != this.zzT) {
                            i3 = 0;
                        } else {
                            i3 = 2;
                        }
                        int i1111 = (z112 ? 1 : 0) | i3;
                        zzadVar = new zzad();
                        if (zzbt.zzg(str3)) {
                            if (zzbt.zzh(str3)) {
                                if (this.zzp == 0) {
                                    i6 = this.zzn;
                                    iIntValue = -1;
                                    if (i6 == -1) {
                                        i6 = this.zzl;
                                    }
                                    this.zzn = i6;
                                    i7 = this.zzo;
                                    if (i7 == -1) {
                                        i7 = this.zzm;
                                    }
                                    this.zzo = i7;
                                } else {
                                    iIntValue = -1;
                                }
                                i4 = this.zzn;
                                if (i4 != iIntValue) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.zzw) {
                                    if (this.zzC != -1.0f) {
                                        bArr2 = new byte[25];
                                        ByteBuffer byteBufferOrder111 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                        byteBufferOrder111.put((byte) 0);
                                        byteBufferOrder111.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                        byteBufferOrder111.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                        byteBufferOrder111.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                        byteBufferOrder111.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                        byteBufferOrder111.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                        byteBufferOrder111.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                        byteBufferOrder111.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                        byteBufferOrder111.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                        byteBufferOrder111.putShort((short) (this.zzK + 0.5f));
                                        byteBufferOrder111.putShort((short) (this.zzL + 0.5f));
                                        byteBufferOrder111.putShort((short) this.zzA);
                                        byteBufferOrder111.putShort((short) this.zzB);
                                    }
                                    zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                                }
                                str4 = this.zza;
                                if (str4 != null) {
                                    map = zzaef.h0;
                                    if (map.containsKey(str4)) {
                                        iIntValue = ((Integer) map.get(this.zza)).intValue();
                                    }
                                }
                                if (this.zzq == 0) {
                                    i9 = iIntValue;
                                } else {
                                    i9 = iIntValue;
                                }
                                zzadVar.zzX(this.zzl);
                                zzadVar.zzF(this.zzm);
                                zzadVar.zzP(f);
                                zzadVar.zzR(i9);
                                zzadVar.zzQ(this.zzu);
                                zzadVar.zzV(this.zzv);
                                zzadVar.zzy(zzqVar);
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i8 = 3;
                            }
                            break;
                        } else {
                            zzadVar.zzw(this.zzN);
                            zzadVar.zzT(this.zzP);
                            zzadVar.zzN(iZzn);
                            i8 = 1;
                        }
                        str5 = this.zza;
                        if (str5 != null) {
                            zzadVar.zzJ(this.zza);
                        }
                        zzadVar.zzG(i);
                        zzadVar.zzS(str3);
                        zzadVar.zzL(i2);
                        zzadVar.zzK(this.b);
                        zzadVar.zzU(i1111);
                        zzadVar.zzI(list4);
                        zzadVar.zzx(str2);
                        zzadVar.zzB(this.zzk);
                        zzaf zzafVarZzY111 = zzadVar.zzY();
                        zzaam zzaamVarZzv111 = zzziVar.zzv(this.zzc, i8);
                        this.zzV = zzaamVarZzv111;
                        zzaamVarZzv111.zzk(zzafVarZzY111);
                        return;
                    }
                    Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    list2 = null;
                    str2 = null;
                    str7 = "audio/x-unknown";
                    i2 = -1;
                    list3 = list2;
                    iZzn = -1;
                    list4 = list3;
                    bArr = this.zzM;
                    if (bArr != null) {
                        str2 = zzzbVarZza.zza;
                        str7 = "video/dolby-vision";
                    }
                    str3 = str7;
                    boolean z113 = this.zzU;
                    if (true != this.zzT) {
                        i3 = 0;
                    } else {
                        i3 = 2;
                    }
                    int i1112 = (z113 ? 1 : 0) | i3;
                    zzadVar = new zzad();
                    if (zzbt.zzg(str3)) {
                        if (zzbt.zzh(str3)) {
                            if (this.zzp == 0) {
                                i6 = this.zzn;
                                iIntValue = -1;
                                if (i6 == -1) {
                                    i6 = this.zzl;
                                }
                                this.zzn = i6;
                                i7 = this.zzo;
                                if (i7 == -1) {
                                    i7 = this.zzm;
                                }
                                this.zzo = i7;
                            } else {
                                iIntValue = -1;
                            }
                            i4 = this.zzn;
                            if (i4 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.zzw) {
                                if (this.zzC != -1.0f) {
                                    bArr2 = new byte[25];
                                    ByteBuffer byteBufferOrder112 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder112.put((byte) 0);
                                    byteBufferOrder112.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                    byteBufferOrder112.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                    byteBufferOrder112.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                    byteBufferOrder112.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                    byteBufferOrder112.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                    byteBufferOrder112.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                    byteBufferOrder112.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                    byteBufferOrder112.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                    byteBufferOrder112.putShort((short) (this.zzK + 0.5f));
                                    byteBufferOrder112.putShort((short) (this.zzL + 0.5f));
                                    byteBufferOrder112.putShort((short) this.zzA);
                                    byteBufferOrder112.putShort((short) this.zzB);
                                }
                                zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                            }
                            str4 = this.zza;
                            if (str4 != null) {
                                map = zzaef.h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(this.zza)).intValue();
                                }
                            }
                            if (this.zzq == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            zzadVar.zzX(this.zzl);
                            zzadVar.zzF(this.zzm);
                            zzadVar.zzP(f);
                            zzadVar.zzR(i9);
                            zzadVar.zzQ(this.zzu);
                            zzadVar.zzV(this.zzv);
                            zzadVar.zzy(zzqVar);
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i8 = 3;
                        }
                        break;
                    } else {
                        zzadVar.zzw(this.zzN);
                        zzadVar.zzT(this.zzP);
                        zzadVar.zzN(iZzn);
                        i8 = 1;
                    }
                    str5 = this.zza;
                    if (str5 != null) {
                        zzadVar.zzJ(this.zza);
                    }
                    zzadVar.zzG(i);
                    zzadVar.zzS(str3);
                    zzadVar.zzL(i2);
                    zzadVar.zzK(this.b);
                    zzadVar.zzU(i1112);
                    zzadVar.zzI(list4);
                    zzadVar.zzx(str2);
                    zzadVar.zzB(this.zzk);
                    zzaf zzafVarZzY112 = zzadVar.zzY();
                    zzaam zzaamVarZzv112 = zzziVar.zzv(this.zzc, i8);
                    this.zzV = zzaamVarZzv112;
                    zzaamVarZzv112.zzk(zzafVarZzY112);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused3) {
                    throw zzbu.zza("Error parsing MS/ACM codec private", null);
                }
            case 24:
                iZzn = zzel.zzn(this.zzO);
                if (iZzn == 0) {
                    Log.w("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    list2 = null;
                    str2 = null;
                    str7 = "audio/x-unknown";
                    i2 = -1;
                    list3 = list2;
                    iZzn = -1;
                    list4 = list3;
                } else {
                    list4 = null;
                    str2 = null;
                    i2 = -1;
                }
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z114 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1113 = (z114 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder113 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder113.put((byte) 0);
                                byteBufferOrder113.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder113.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder113.putShort((short) this.zzA);
                                byteBufferOrder113.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i1113);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY113 = zzadVar.zzY();
                zzaam zzaamVarZzv113 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv113;
                zzaamVarZzv113.zzk(zzafVarZzY113);
                return;
            case 25:
                int i30 = this.zzO;
                if (i30 == 8) {
                    list4 = null;
                    str2 = null;
                    i2 = -1;
                    iZzn = 3;
                } else if (i30 == 16) {
                    iZzn = 268435456;
                    list4 = null;
                    str2 = null;
                    i2 = -1;
                } else {
                    Log.w("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i30 + ". Setting mimeType to audio/x-unknown");
                    list2 = null;
                    str2 = null;
                    str7 = "audio/x-unknown";
                    i2 = -1;
                    list3 = list2;
                    iZzn = -1;
                    list4 = list3;
                }
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z115 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1114 = (z115 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder114 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder114.put((byte) 0);
                                byteBufferOrder114.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder114.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder114.putShort((short) this.zzA);
                                byteBufferOrder114.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i1114);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY114 = zzadVar.zzY();
                zzaam zzaamVarZzv114 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv114;
                zzaamVarZzv114.zzk(zzafVarZzY114);
                return;
            case 26:
                int i31 = this.zzO;
                if (i31 == 32) {
                    list4 = null;
                    str2 = null;
                    i2 = -1;
                } else {
                    Log.w("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i31 + ". Setting mimeType to audio/x-unknown");
                    list2 = null;
                    str2 = null;
                    str7 = "audio/x-unknown";
                    i2 = -1;
                    list3 = list2;
                    iZzn = -1;
                    list4 = list3;
                }
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z116 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1115 = (z116 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder115 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder115.put((byte) 0);
                                byteBufferOrder115.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder115.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder115.putShort((short) this.zzA);
                                byteBufferOrder115.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i1115);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY115 = zzadVar.zzY();
                zzaam zzaamVarZzv115 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv115;
                zzaamVarZzv115.zzk(zzafVarZzY115);
                return;
            case 27:
                str7 = "application/x-subrip";
                list2 = null;
                str2 = null;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z117 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1116 = (z117 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder116 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder116.put((byte) 0);
                                byteBufferOrder116.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder116.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder116.putShort((short) this.zzA);
                                byteBufferOrder116.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i1116);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY116 = zzadVar.zzY();
                zzaam zzaamVarZzv116 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv116;
                zzaamVarZzv116.zzk(zzafVarZzY116);
                return;
            case 28:
                str7 = "text/x-ssa";
                listSingletonList = zzfuv.zzq(zzaef.d0, a(this.zzb));
                str2 = null;
                list2 = listSingletonList;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z118 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1117 = (z118 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder117 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder117.put((byte) 0);
                                byteBufferOrder117.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder117.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder117.putShort((short) this.zzA);
                                byteBufferOrder117.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i1117);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY117 = zzadVar.zzY();
                zzaam zzaamVarZzv117 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv117;
                zzaamVarZzv117.zzk(zzafVarZzY117);
                return;
            case 29:
                str7 = "text/vtt";
                list2 = null;
                str2 = null;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z119 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1118 = (z119 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder118 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder118.put((byte) 0);
                                byteBufferOrder118.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder118.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder118.putShort((short) this.zzA);
                                byteBufferOrder118.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i1118);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY118 = zzadVar.zzY();
                zzaam zzaamVarZzv118 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv118;
                zzaamVarZzv118.zzk(zzafVarZzY118);
                return;
            case 30:
                str7 = "application/vobsub";
                listSingletonList = zzfuv.zzp(a(str6));
                str2 = null;
                list2 = listSingletonList;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z1110 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1119 = (z1110 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder119 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder119.put((byte) 0);
                                byteBufferOrder119.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder119.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder119.putShort((short) this.zzA);
                                byteBufferOrder119.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i1119);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY119 = zzadVar.zzY();
                zzaam zzaamVarZzv119 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv119;
                zzaamVarZzv119.zzk(zzafVarZzY119);
                return;
            case 31:
                str7 = "application/pgs";
                list2 = null;
                str2 = null;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z1111 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i11110 = (z1111 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder1110 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1110.put((byte) 0);
                                byteBufferOrder1110.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder1110.putShort((short) this.zzA);
                                byteBufferOrder1110.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i11110);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY1110 = zzadVar.zzY();
                zzaam zzaamVarZzv1110 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv1110;
                zzaamVarZzv1110.zzk(zzafVarZzY1110);
                return;
            case 32:
                byte[] bArr6 = new byte[4];
                System.arraycopy(a(str6), 0, bArr6, 0, 4);
                str7 = "application/dvbsubs";
                listSingletonList = zzfuv.zzp(bArr6);
                str2 = null;
                list2 = listSingletonList;
                i2 = -1;
                list3 = list2;
                iZzn = -1;
                list4 = list3;
                bArr = this.zzM;
                if (bArr != null) {
                    str2 = zzzbVarZza.zza;
                    str7 = "video/dolby-vision";
                }
                str3 = str7;
                boolean z1112 = this.zzU;
                if (true != this.zzT) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i11111 = (z1112 ? 1 : 0) | i3;
                zzadVar = new zzad();
                if (zzbt.zzg(str3)) {
                    if (zzbt.zzh(str3)) {
                        if (this.zzp == 0) {
                            i6 = this.zzn;
                            iIntValue = -1;
                            if (i6 == -1) {
                                i6 = this.zzl;
                            }
                            this.zzn = i6;
                            i7 = this.zzo;
                            if (i7 == -1) {
                                i7 = this.zzm;
                            }
                            this.zzo = i7;
                        } else {
                            iIntValue = -1;
                        }
                        i4 = this.zzn;
                        if (i4 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzw) {
                            if (this.zzC != -1.0f) {
                                bArr2 = new byte[25];
                                ByteBuffer byteBufferOrder1111 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1111.put((byte) 0);
                                byteBufferOrder1111.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.zzK + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder1111.putShort((short) this.zzA);
                                byteBufferOrder1111.putShort((short) this.zzB);
                            }
                            zzqVar = new zzq(this.zzx, this.zzz, this.zzy, bArr2);
                        }
                        str4 = this.zza;
                        if (str4 != null) {
                            map = zzaef.h0;
                            if (map.containsKey(str4)) {
                                iIntValue = ((Integer) map.get(this.zza)).intValue();
                            }
                        }
                        if (this.zzq == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzadVar.zzX(this.zzl);
                        zzadVar.zzF(this.zzm);
                        zzadVar.zzP(f);
                        zzadVar.zzR(i9);
                        zzadVar.zzQ(this.zzu);
                        zzadVar.zzV(this.zzv);
                        zzadVar.zzy(zzqVar);
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i8 = 3;
                    }
                    break;
                } else {
                    zzadVar.zzw(this.zzN);
                    zzadVar.zzT(this.zzP);
                    zzadVar.zzN(iZzn);
                    i8 = 1;
                }
                str5 = this.zza;
                if (str5 != null) {
                    zzadVar.zzJ(this.zza);
                }
                zzadVar.zzG(i);
                zzadVar.zzS(str3);
                zzadVar.zzL(i2);
                zzadVar.zzK(this.b);
                zzadVar.zzU(i11111);
                zzadVar.zzI(list4);
                zzadVar.zzx(str2);
                zzadVar.zzB(this.zzk);
                zzaf zzafVarZzY1111 = zzadVar.zzY();
                zzaam zzaamVarZzv1111 = zzziVar.zzv(this.zzc, i8);
                this.zzV = zzaamVarZzv1111;
                zzaamVarZzv1111.zzk(zzafVarZzY1111);
                return;
            default:
                throw zzbu.zza("Unrecognized codec identifier.", null);
        }
    }
}
