package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import defpackage.a42;

/* JADX INFO: loaded from: classes3.dex */
public final class zzql {
    public final boolean a;
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;

    public zzql(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z2;
        this.zzf = z3;
        this.a = zzbt.zzh(str2);
    }

    public static boolean b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(zzel.zze(i, widthAlignment) * widthAlignment, zzel.zze(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    public static zzql zzc(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        if (codecCapabilities != null) {
            int i = zzel.zza;
            if (codecCapabilities.isFeatureSupported("adaptive-playback")) {
                if (zzel.zza <= 22) {
                    String str4 = zzel.zzd;
                    z6 = (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) ? false : true;
                }
            }
        }
        if (codecCapabilities != null && zzel.zza >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new zzql(str, str2, str3, codecCapabilities, z, z6, z5 || (codecCapabilities != null && zzel.zza >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    public final void a(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.zza + ", " + this.zzb + "] [" + zzel.zze + "]");
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzel.zze(i, widthAlignment) * widthAlignment, zzel.zze(i2, heightAlignment) * heightAlignment);
    }

    public final zzgr zzb(zzaf zzafVar, zzaf zzafVar2) {
        int i = true != zzel.zzT(zzafVar.zzm, zzafVar2.zzm) ? 8 : 0;
        if (this.a) {
            if (zzafVar.zzu != zzafVar2.zzu) {
                i |= 1024;
            }
            if (!this.zze && (zzafVar.zzr != zzafVar2.zzr || zzafVar.zzs != zzafVar2.zzs)) {
                i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            if (!zzel.zzT(zzafVar.zzy, zzafVar2.zzy)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzel.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzafVar.zzd(zzafVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzgr(this.zza, zzafVar, zzafVar2, true != zzafVar.zzd(zzafVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzafVar.zzz != zzafVar2.zzz) {
                i |= 4096;
            }
            if (zzafVar.zzA != zzafVar2.zzA) {
                i |= 8192;
            }
            if (zzafVar.zzB != zzafVar2.zzB) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair pairZzb = zzrd.zzb(zzafVar);
                Pair pairZzb2 = zzrd.zzb(zzafVar2);
                if (pairZzb != null && pairZzb2 != null) {
                    int iIntValue = ((Integer) pairZzb.first).intValue();
                    int iIntValue2 = ((Integer) pairZzb2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zzgr(this.zza, zzafVar, zzafVar2, 3, 0);
                    }
                }
            }
            if (!zzafVar.zzd(zzafVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzgr(this.zza, zzafVar, zzafVar2, 1, 0);
            }
        }
        return new zzgr(this.zza, zzafVar, zzafVar2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:63:0x00df  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fa  */
    public final boolean zzd(zzaf zzafVar) {
        int i;
        Pair pairZzb;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzg;
        int length;
        int i2;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        int iIntValue;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (!this.zzb.equals(zzafVar.zzm) && !this.zzb.equals(zzrd.zze(zzafVar))) {
            return false;
        }
        String str = zzafVar.zzj;
        int i3 = 16;
        boolean z = this.a;
        if (str != null && (pairZzb = zzrd.zzb(zzafVar)) != null) {
            int iIntValue2 = ((Integer) pairZzb.first).intValue();
            int iIntValue3 = ((Integer) pairZzb.second).intValue();
            int i4 = 2;
            if ("video/dolby-vision".equals(zzafVar.zzm)) {
                if ("video/avc".equals(this.zzb)) {
                    iIntValue3 = 0;
                    iIntValue2 = 8;
                } else if ("video/hevc".equals(this.zzb)) {
                    iIntValue3 = 0;
                    iIntValue2 = 2;
                }
            }
            if (z) {
                codecProfileLevelArrZzg = zzg();
                if (zzel.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && codecProfileLevelArrZzg.length == 0) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    }
                    if (iIntValue >= 180000000) {
                        i4 = 1024;
                    } else if (iIntValue >= 120000000) {
                        i4 = AdRequest.MAX_CONTENT_URL_LENGTH;
                    } else if (iIntValue >= 60000000) {
                        i4 = 256;
                    } else if (iIntValue >= 30000000) {
                        i4 = 128;
                    } else if (iIntValue >= 18000000) {
                        i4 = 64;
                    } else if (iIntValue >= 12000000) {
                        i4 = 32;
                    } else if (iIntValue >= 7200000) {
                        i4 = 16;
                    } else if (iIntValue >= 3600000) {
                        i4 = 8;
                    } else if (iIntValue >= 1800000) {
                        i4 = 4;
                    } else if (iIntValue < 800000) {
                        i4 = 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel2.profile = 1;
                    codecProfileLevel2.level = i4;
                    codecProfileLevelArrZzg = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel2};
                }
                length = codecProfileLevelArrZzg.length;
                i2 = 0;
                while (true) {
                    if (i2 < length) {
                        a("codec.profileLevel, " + zzafVar.zzj + ", " + this.zzc);
                        return false;
                    }
                    codecProfileLevel = codecProfileLevelArrZzg[i2];
                    if (codecProfileLevel.profile != iIntValue2 && codecProfileLevel.level >= iIntValue3) {
                        break;
                    }
                    i2++;
                }
            } else if (iIntValue2 == 42) {
                iIntValue2 = 42;
                codecProfileLevelArrZzg = zzg();
                if (zzel.zza <= 23) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue >= 180000000) {
                        i4 = 1024;
                    } else if (iIntValue >= 120000000) {
                        i4 = AdRequest.MAX_CONTENT_URL_LENGTH;
                    } else if (iIntValue >= 60000000) {
                        i4 = 256;
                    } else if (iIntValue >= 30000000) {
                        i4 = 128;
                    } else if (iIntValue >= 18000000) {
                        i4 = 64;
                    } else if (iIntValue >= 12000000) {
                        i4 = 32;
                    } else if (iIntValue >= 7200000) {
                        i4 = 16;
                    } else if (iIntValue >= 3600000) {
                        i4 = 8;
                    } else if (iIntValue >= 1800000) {
                        i4 = 4;
                    } else if (iIntValue < 800000) {
                        i4 = 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel3.profile = 1;
                    codecProfileLevel3.level = i4;
                    codecProfileLevelArrZzg = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel3};
                }
                length = codecProfileLevelArrZzg.length;
                i2 = 0;
                while (true) {
                    if (i2 < length) {
                        a("codec.profileLevel, " + zzafVar.zzj + ", " + this.zzc);
                        return false;
                    }
                    codecProfileLevel = codecProfileLevelArrZzg[i2];
                    if (codecProfileLevel.profile != iIntValue2) {
                    }
                    i2++;
                }
            }
        }
        if (z) {
            int i5 = zzafVar.zzr;
            if (i5 <= 0 || (i = zzafVar.zzs) <= 0) {
                return true;
            }
            if (zzel.zza >= 21) {
                return zzf(i5, i, zzafVar.zzt);
            }
            boolean z2 = i5 * i <= zzrd.zza();
            if (!z2) {
                a("legacyFrameSize, " + zzafVar.zzr + "x" + zzafVar.zzs);
            }
            return z2;
        }
        int i6 = zzel.zza;
        if (i6 >= 21) {
            int i7 = zzafVar.zzA;
            if (i7 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                if (codecCapabilities2 == null) {
                    a("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities == null) {
                    a("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i7)) {
                    a("sampleRate.support, " + i7);
                    return false;
                }
            }
            int i8 = zzafVar.zzz;
            if (i8 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.zzd;
                if (codecCapabilities3 == null) {
                    a("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        a("channelCount.aCaps");
                    } else {
                        String str2 = this.zza;
                        String str3 = this.zzb;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i6 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str3) && !"audio/3gpp".equals(str3) && !"audio/amr-wb".equals(str3) && !"audio/mp4a-latm".equals(str3) && !"audio/vorbis".equals(str3) && !"audio/opus".equals(str3) && !"audio/raw".equals(str3) && !"audio/flac".equals(str3) && !"audio/g711-alaw".equals(str3) && !"audio/g711-mlaw".equals(str3) && !"audio/gsm".equals(str3))) {
                            if ("audio/ac3".equals(str3)) {
                                i3 = 6;
                            } else if (!"audio/eac3".equals(str3)) {
                                i3 = 30;
                            }
                            Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str2 + ", [" + maxInputChannelCount + " to " + i3 + "]");
                            maxInputChannelCount = i3;
                        }
                        if (maxInputChannelCount < i8) {
                            a("channelCount.support, " + i8);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean zze(zzaf zzafVar) {
        if (this.a) {
            return this.zze;
        }
        Pair pairZzb = zzrd.zzb(zzafVar);
        return pairZzb != null && ((Integer) pairZzb.first).intValue() == 42;
    }

    public final boolean zzf(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        if (b(videoCapabilities, i, i2, d)) {
            return true;
        }
        if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzel.zzb)) || !b(videoCapabilities, i2, i, d))) {
            StringBuilder sbA = a42.a("sizeAndRate.support, ", i, "x", i2, "x");
            sbA.append(d);
            a(sbA.toString());
            return false;
        }
        StringBuilder sbA2 = a42.a("sizeAndRate.rotated, ", i, "x", i2, "x");
        sbA2.append(d);
        Log.d("MediaCodecInfo", "AssumedSupport [" + sbA2.toString() + "] [" + this.zza + ", " + this.zzb + "] [" + zzel.zze + "]");
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzg() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
