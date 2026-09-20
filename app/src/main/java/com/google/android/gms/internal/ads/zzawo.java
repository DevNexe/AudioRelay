package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import defpackage.a42;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(16)
public final class zzawo {
    public final String a;
    public final MediaCodecInfo.CodecCapabilities b;
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public zzawo(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        str.getClass();
        this.zza = str;
        this.a = str2;
        this.b = codecCapabilities;
        boolean z3 = true;
        this.zzb = !z && codecCapabilities != null && zzban.zza >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.zzc = codecCapabilities != null && zzban.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (!z2 && (codecCapabilities == null || zzban.zza < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z3 = false;
        }
        this.zzd = z3;
    }

    public static zzawo zza(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new zzawo(str, str2, codecCapabilities, z, z2);
    }

    public static zzawo zzb(String str) {
        return new zzawo("OMX.google.raw.decoder", null, null, false, false);
    }

    public final void a(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.zza + ", " + this.a + "] [" + zzban.zze + "]");
    }

    @TargetApi(21)
    public final boolean zzc(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.b;
        if (codecCapabilities == null) {
            a("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            a("channelCount.aCaps");
            return false;
        }
        if (audioCapabilities.getMaxInputChannelCount() >= i) {
            return true;
        }
        a("channelCount.support, " + i);
        return false;
    }

    @TargetApi(21)
    public final boolean zzd(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.b;
        if (codecCapabilities == null) {
            a("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            a("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        a("sampleRate.support, " + i);
        return false;
    }

    public final boolean zze(String str) {
        String str2;
        String str3;
        if (str == null || (str2 = this.a) == null) {
            return true;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("avc1") || strTrim.startsWith("avc3")) {
            str3 = "video/avc";
        } else if (strTrim.startsWith("hev1") || strTrim.startsWith("hvc1")) {
            str3 = "video/hevc";
        } else if (strTrim.startsWith("vp9")) {
            str3 = "video/x-vnd.on2.vp9";
        } else if (strTrim.startsWith("vp8")) {
            str3 = "video/x-vnd.on2.vp8";
        } else if (strTrim.startsWith("mp4a")) {
            str3 = "audio/mp4a-latm";
        } else if (strTrim.startsWith("ac-3") || strTrim.startsWith("dac3")) {
            str3 = "audio/ac3";
        } else if (strTrim.startsWith("ec-3") || strTrim.startsWith("dec3")) {
            str3 = "audio/eac3";
        } else if (strTrim.startsWith("dtsc") || strTrim.startsWith("dtse")) {
            str3 = "audio/vnd.dts";
        } else if (strTrim.startsWith("dtsh") || strTrim.startsWith("dtsl")) {
            str3 = "audio/vnd.dts.hd";
        } else if (strTrim.startsWith("opus")) {
            str3 = "audio/opus";
        } else {
            str3 = strTrim.startsWith("vorbis") ? "audio/vorbis" : null;
        }
        if (str3 == null) {
            return true;
        }
        if (!str2.equals(str3)) {
            a("codec.mime " + str + ", " + str3);
            return false;
        }
        Pair pairZzb = zzaxa.zzb(str);
        if (pairZzb == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzg()) {
            if (codecProfileLevel.profile == ((Integer) pairZzb.first).intValue() && codecProfileLevel.level >= ((Integer) pairZzb.second).intValue()) {
                return true;
            }
        }
        a("codec.profileLevel, " + str + ", " + str3);
        return false;
    }

    @TargetApi(21)
    public final boolean zzf(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.b;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        if ((d == -1.0d || d <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d)) {
            return true;
        }
        if (i < i2) {
            if ((d == -1.0d || d <= 0.0d) ? videoCapabilities.isSizeSupported(i2, i) : videoCapabilities.areSizeAndRateSupported(i2, i, d)) {
                StringBuilder sbA = a42.a("sizeAndRate.rotated, ", i, "x", i2, "x");
                sbA.append(d);
                Log.d("MediaCodecInfo", "AssumedSupport [" + sbA.toString() + "] [" + this.zza + ", " + this.a + "] [" + zzban.zze + "]");
                return true;
            }
        }
        StringBuilder sbA2 = a42.a("sizeAndRate.support, ", i, "x", i2, "x");
        sbA2.append(d);
        a(sbA2.toString());
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzg() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.b;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
