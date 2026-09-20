package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.gms.ads.AdRequest;
import defpackage.w16;
import defpackage.x16;
import defpackage.y16;
import defpackage.z16;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class zzaxa {
    public static final Pattern a;
    public static final HashMap b;
    public static final SparseIntArray c;
    public static final SparseIntArray d;
    public static final HashMap e;
    public static int f;

    static {
        zzawo.zzb("OMX.google.raw.decoder");
        a = Pattern.compile("^\\D?(\\d+)$");
        b = new HashMap();
        f = -1;
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, AdRequest.MAX_CONTENT_URL_LENGTH);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap map = new HashMap();
        e = map;
        map.put("L30", 1);
        map.put("L60", 4);
        map.put("L63", 16);
        map.put("L90", 64);
        map.put("L93", 256);
        map.put("L120", 1024);
        map.put("L123", 4096);
        map.put("L150", 16384);
        map.put("L153", 65536);
        map.put("L156", 262144);
        map.put("L180", 1048576);
        map.put("L183", 4194304);
        map.put("L186", 16777216);
        map.put("H30", 2);
        map.put("H60", 8);
        map.put("H63", 32);
        map.put("H90", 128);
        map.put("H93", Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH));
        map.put("H120", 2048);
        map.put("H123", 8192);
        map.put("H150", 32768);
        map.put("H153", 131072);
        map.put("H156", 524288);
        map.put("H180", 2097152);
        map.put("H183", 8388608);
        map.put("H186", 33554432);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x019f A[Catch: Exception -> 0x01b9, TryCatch #2 {Exception -> 0x01b9, blocks: (B:102:0x0195, B:104:0x019f, B:106:0x01a7, B:108:0x01af), top: B:150:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01a7 A[Catch: Exception -> 0x01b9, TryCatch #2 {Exception -> 0x01b9, blocks: (B:102:0x0195, B:104:0x019f, B:106:0x01a7, B:108:0x01af), top: B:150:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x023e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0243 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x0120  */
    /* JADX WARN: Code duplicated, block: B:76:0x0126 A[Catch: Exception -> 0x0259, TRY_ENTER, TryCatch #3 {Exception -> 0x0259, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x0030, B:14:0x0036, B:16:0x003e, B:18:0x0046, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:28:0x006a, B:31:0x0074, B:33:0x007c, B:37:0x008a, B:39:0x0092, B:41:0x009c, B:43:0x00a4, B:45:0x00ac, B:47:0x00b4, B:49:0x00bc, B:51:0x00c4, B:53:0x00cc, B:55:0x00d4, B:57:0x00dc, B:59:0x00e4, B:61:0x00ec, B:64:0x00f6, B:66:0x00fe, B:68:0x0108, B:70:0x0110, B:72:0x0118, B:76:0x0126, B:78:0x012e, B:80:0x0138, B:82:0x0142, B:84:0x014a, B:86:0x0150, B:88:0x0158, B:91:0x0162, B:93:0x016a, B:95:0x0172, B:97:0x017a, B:131:0x01f4, B:134:0x01fc, B:136:0x0202, B:137:0x021c, B:138:0x023d), top: B:152:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0160  */
    /* JADX WARN: Code duplicated, block: B:91:0x0162 A[Catch: Exception -> 0x0259, TryCatch #3 {Exception -> 0x0259, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x0030, B:14:0x0036, B:16:0x003e, B:18:0x0046, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:28:0x006a, B:31:0x0074, B:33:0x007c, B:37:0x008a, B:39:0x0092, B:41:0x009c, B:43:0x00a4, B:45:0x00ac, B:47:0x00b4, B:49:0x00bc, B:51:0x00c4, B:53:0x00cc, B:55:0x00d4, B:57:0x00dc, B:59:0x00e4, B:61:0x00ec, B:64:0x00f6, B:66:0x00fe, B:68:0x0108, B:70:0x0110, B:72:0x0118, B:76:0x0126, B:78:0x012e, B:80:0x0138, B:82:0x0142, B:84:0x014a, B:86:0x0150, B:88:0x0158, B:91:0x0162, B:93:0x016a, B:95:0x0172, B:97:0x017a, B:131:0x01f4, B:134:0x01fc, B:136:0x0202, B:137:0x021c, B:138:0x023d), top: B:152:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0172 A[Catch: Exception -> 0x0259, TryCatch #3 {Exception -> 0x0259, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x0030, B:14:0x0036, B:16:0x003e, B:18:0x0046, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:28:0x006a, B:31:0x0074, B:33:0x007c, B:37:0x008a, B:39:0x0092, B:41:0x009c, B:43:0x00a4, B:45:0x00ac, B:47:0x00b4, B:49:0x00bc, B:51:0x00c4, B:53:0x00cc, B:55:0x00d4, B:57:0x00dc, B:59:0x00e4, B:61:0x00ec, B:64:0x00f6, B:66:0x00fe, B:68:0x0108, B:70:0x0110, B:72:0x0118, B:76:0x0126, B:78:0x012e, B:80:0x0138, B:82:0x0142, B:84:0x014a, B:86:0x0150, B:88:0x0158, B:91:0x0162, B:93:0x016a, B:95:0x0172, B:97:0x017a, B:131:0x01f4, B:134:0x01fc, B:136:0x0202, B:137:0x021c, B:138:0x023d), top: B:152:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x017a A[Catch: Exception -> 0x0259, TRY_LEAVE, TryCatch #3 {Exception -> 0x0259, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x0030, B:14:0x0036, B:16:0x003e, B:18:0x0046, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:28:0x006a, B:31:0x0074, B:33:0x007c, B:37:0x008a, B:39:0x0092, B:41:0x009c, B:43:0x00a4, B:45:0x00ac, B:47:0x00b4, B:49:0x00bc, B:51:0x00c4, B:53:0x00cc, B:55:0x00d4, B:57:0x00dc, B:59:0x00e4, B:61:0x00ec, B:64:0x00f6, B:66:0x00fe, B:68:0x0108, B:70:0x0110, B:72:0x0118, B:76:0x0126, B:78:0x012e, B:80:0x0138, B:82:0x0142, B:84:0x014a, B:86:0x0150, B:88:0x0158, B:91:0x0162, B:93:0x016a, B:95:0x0172, B:97:0x017a, B:131:0x01f4, B:134:0x01fc, B:136:0x0202, B:137:0x021c, B:138:0x023d), top: B:152:0x0004 }] */
    public static ArrayList a(w16 w16Var, x16 x16Var) throws zzawv {
        int i;
        String[] supportedTypes;
        int length;
        int i2;
        String str;
        int i3;
        MediaCodecInfo mediaCodecInfo;
        String str2;
        boolean z;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = w16Var.a;
            int iZza = x16Var.zza();
            boolean zZzd = x16Var.zzd();
            int i4 = 0;
            while (i4 < iZza) {
                MediaCodecInfo mediaCodecInfoZzb = x16Var.zzb(i4);
                String name = mediaCodecInfoZzb.getName();
                if (!mediaCodecInfoZzb.isEncoder() && ((zZzd || !name.endsWith(".secure")) && (((i = zzban.zza) >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))) && ((i >= 18 || !"OMX.SEC.MP3.Decoder".equals(name)) && (i >= 18 || !"OMX.MTK.AUDIO.DECODER.AAC".equals(name) || !"a70".equals(zzban.zzb)))))) {
                    if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(name)) {
                        String str4 = zzban.zzb;
                        if (!"dlxu".equals(str4) && !"protou".equals(str4) && !"ville".equals(str4) && !"villeplus".equals(str4) && !"villec2".equals(str4) && !str4.startsWith("gee") && !"C6602".equals(str4) && !"C6603".equals(str4) && !"C6606".equals(str4) && !"C6616".equals(str4) && !"L36h".equals(str4) && !"SO-02E".equals(str4)) {
                            if (i != 16) {
                                if (i > 19) {
                                    if (i <= 19) {
                                        supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                        length = supportedTypes.length;
                                        i2 = 0;
                                        while (i2 < length) {
                                            str = supportedTypes[i2];
                                            if (str.equalsIgnoreCase(str3)) {
                                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                                boolean zA = x16Var.a(str3, capabilitiesForType);
                                                i3 = iZza;
                                                mediaCodecInfo = mediaCodecInfoZzb;
                                                if (zzban.zza <= 22) {
                                                    str2 = zzban.zzd;
                                                    if (str2.equals("ODROID-XU3")) {
                                                    }
                                                } else {
                                                    z = false;
                                                }
                                                boolean z2 = w16Var.b;
                                                if (!zZzd) {
                                                    if (zZzd) {
                                                        continue;
                                                    }
                                                } else if (zZzd) {
                                                    continue;
                                                }
                                            } else {
                                                i3 = iZza;
                                                mediaCodecInfo = mediaCodecInfoZzb;
                                            }
                                            i2++;
                                            x16Var = x16Var;
                                            iZza = i3;
                                            mediaCodecInfoZzb = mediaCodecInfo;
                                        }
                                    } else {
                                        supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                        length = supportedTypes.length;
                                        i2 = 0;
                                        while (i2 < length) {
                                            str = supportedTypes[i2];
                                            if (str.equalsIgnoreCase(str3)) {
                                                MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                                boolean zA2 = x16Var.a(str3, capabilitiesForType2);
                                                i3 = iZza;
                                                mediaCodecInfo = mediaCodecInfoZzb;
                                                if (zzban.zza <= 22) {
                                                    str2 = zzban.zzd;
                                                    if (str2.equals("ODROID-XU3")) {
                                                    }
                                                } else {
                                                    z = false;
                                                }
                                                boolean z3 = w16Var.b;
                                                if (!zZzd) {
                                                    if (zZzd) {
                                                        continue;
                                                    }
                                                } else if (zZzd) {
                                                    continue;
                                                }
                                            } else {
                                                i3 = iZza;
                                                mediaCodecInfo = mediaCodecInfoZzb;
                                            }
                                            i2++;
                                            x16Var = x16Var;
                                            iZza = i3;
                                            mediaCodecInfoZzb = mediaCodecInfo;
                                        }
                                    }
                                } else if (i <= 19) {
                                    supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                    length = supportedTypes.length;
                                    i2 = 0;
                                    while (i2 < length) {
                                        str = supportedTypes[i2];
                                        if (str.equalsIgnoreCase(str3)) {
                                            MediaCodecInfo.CodecCapabilities capabilitiesForType3 = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                            boolean zA3 = x16Var.a(str3, capabilitiesForType3);
                                            i3 = iZza;
                                            mediaCodecInfo = mediaCodecInfoZzb;
                                            if (zzban.zza <= 22) {
                                                str2 = zzban.zzd;
                                                if (str2.equals("ODROID-XU3")) {
                                                }
                                            } else {
                                                z = false;
                                            }
                                            boolean z4 = w16Var.b;
                                            if (!zZzd) {
                                                if (zZzd) {
                                                    continue;
                                                }
                                            } else if (zZzd) {
                                                continue;
                                            }
                                        } else {
                                            i3 = iZza;
                                            mediaCodecInfo = mediaCodecInfoZzb;
                                        }
                                        i2++;
                                        x16Var = x16Var;
                                        iZza = i3;
                                        mediaCodecInfoZzb = mediaCodecInfo;
                                    }
                                } else {
                                    supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                    length = supportedTypes.length;
                                    i2 = 0;
                                    while (i2 < length) {
                                        str = supportedTypes[i2];
                                        if (str.equalsIgnoreCase(str3)) {
                                            MediaCodecInfo.CodecCapabilities capabilitiesForType4 = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                            boolean zA4 = x16Var.a(str3, capabilitiesForType4);
                                            i3 = iZza;
                                            mediaCodecInfo = mediaCodecInfoZzb;
                                            if (zzban.zza <= 22) {
                                                str2 = zzban.zzd;
                                                if (str2.equals("ODROID-XU3")) {
                                                }
                                            } else {
                                                z = false;
                                            }
                                            boolean z5 = w16Var.b;
                                            if (!zZzd) {
                                                if (zZzd) {
                                                    continue;
                                                }
                                            } else if (zZzd) {
                                                continue;
                                            }
                                        } else {
                                            i3 = iZza;
                                            mediaCodecInfo = mediaCodecInfoZzb;
                                        }
                                        i2++;
                                        x16Var = x16Var;
                                        iZza = i3;
                                        mediaCodecInfoZzb = mediaCodecInfo;
                                    }
                                }
                            } else if (i > 19) {
                                if (i <= 19) {
                                    supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                    length = supportedTypes.length;
                                    i2 = 0;
                                    while (i2 < length) {
                                        str = supportedTypes[i2];
                                        if (str.equalsIgnoreCase(str3)) {
                                            MediaCodecInfo.CodecCapabilities capabilitiesForType5 = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                            boolean zA5 = x16Var.a(str3, capabilitiesForType5);
                                            i3 = iZza;
                                            mediaCodecInfo = mediaCodecInfoZzb;
                                            if (zzban.zza <= 22) {
                                                str2 = zzban.zzd;
                                                if (str2.equals("ODROID-XU3")) {
                                                }
                                            } else {
                                                z = false;
                                            }
                                            boolean z6 = w16Var.b;
                                            if (!zZzd) {
                                                if (zZzd) {
                                                    continue;
                                                }
                                            } else if (zZzd) {
                                                continue;
                                            }
                                        } else {
                                            i3 = iZza;
                                            mediaCodecInfo = mediaCodecInfoZzb;
                                        }
                                        i2++;
                                        x16Var = x16Var;
                                        iZza = i3;
                                        mediaCodecInfoZzb = mediaCodecInfo;
                                    }
                                } else {
                                    supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                    length = supportedTypes.length;
                                    i2 = 0;
                                    while (i2 < length) {
                                        str = supportedTypes[i2];
                                        if (str.equalsIgnoreCase(str3)) {
                                            MediaCodecInfo.CodecCapabilities capabilitiesForType6 = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                            boolean zA6 = x16Var.a(str3, capabilitiesForType6);
                                            i3 = iZza;
                                            mediaCodecInfo = mediaCodecInfoZzb;
                                            if (zzban.zza <= 22) {
                                                str2 = zzban.zzd;
                                                if (str2.equals("ODROID-XU3")) {
                                                }
                                            } else {
                                                z = false;
                                            }
                                            boolean z7 = w16Var.b;
                                            if (!zZzd) {
                                                if (zZzd) {
                                                    continue;
                                                }
                                            } else if (zZzd) {
                                                continue;
                                            }
                                        } else {
                                            i3 = iZza;
                                            mediaCodecInfo = mediaCodecInfoZzb;
                                        }
                                        i2++;
                                        x16Var = x16Var;
                                        iZza = i3;
                                        mediaCodecInfoZzb = mediaCodecInfo;
                                    }
                                }
                            } else if (i <= 19) {
                                supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                length = supportedTypes.length;
                                i2 = 0;
                                while (i2 < length) {
                                    str = supportedTypes[i2];
                                    if (str.equalsIgnoreCase(str3)) {
                                        MediaCodecInfo.CodecCapabilities capabilitiesForType7 = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                        boolean zA7 = x16Var.a(str3, capabilitiesForType7);
                                        i3 = iZza;
                                        mediaCodecInfo = mediaCodecInfoZzb;
                                        if (zzban.zza <= 22) {
                                            str2 = zzban.zzd;
                                            if (str2.equals("ODROID-XU3")) {
                                            }
                                        } else {
                                            z = false;
                                        }
                                        boolean z8 = w16Var.b;
                                        if (!zZzd) {
                                            if (zZzd) {
                                                continue;
                                            }
                                        } else if (zZzd) {
                                            continue;
                                        }
                                    } else {
                                        i3 = iZza;
                                        mediaCodecInfo = mediaCodecInfoZzb;
                                    }
                                    i2++;
                                    x16Var = x16Var;
                                    iZza = i3;
                                    mediaCodecInfoZzb = mediaCodecInfo;
                                }
                            } else {
                                supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                length = supportedTypes.length;
                                i2 = 0;
                                while (i2 < length) {
                                    str = supportedTypes[i2];
                                    if (str.equalsIgnoreCase(str3)) {
                                        MediaCodecInfo.CodecCapabilities capabilitiesForType8 = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                        boolean zA8 = x16Var.a(str3, capabilitiesForType8);
                                        i3 = iZza;
                                        mediaCodecInfo = mediaCodecInfoZzb;
                                        if (zzban.zza <= 22) {
                                            str2 = zzban.zzd;
                                            if (str2.equals("ODROID-XU3")) {
                                            }
                                        } else {
                                            z = false;
                                        }
                                        boolean z9 = w16Var.b;
                                        if (!zZzd) {
                                            if (zZzd) {
                                                continue;
                                            }
                                        } else if (zZzd) {
                                            continue;
                                        }
                                    } else {
                                        i3 = iZza;
                                        mediaCodecInfo = mediaCodecInfoZzb;
                                    }
                                    i2++;
                                    x16Var = x16Var;
                                    iZza = i3;
                                    mediaCodecInfoZzb = mediaCodecInfo;
                                }
                            }
                        }
                    } else if (i != 16 && "OMX.qcom.audio.decoder.aac".equals(name)) {
                        String str5 = zzban.zzb;
                        if (!"C1504".equals(str5) && !"C1505".equals(str5) && !"C1604".equals(str5) && !"C1605".equals(str5)) {
                            if (i > 19) {
                                if (i <= 19) {
                                    supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                    length = supportedTypes.length;
                                    i2 = 0;
                                    while (i2 < length) {
                                        str = supportedTypes[i2];
                                        if (str.equalsIgnoreCase(str3)) {
                                            MediaCodecInfo.CodecCapabilities capabilitiesForType9 = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                            boolean zA9 = x16Var.a(str3, capabilitiesForType9);
                                            i3 = iZza;
                                            mediaCodecInfo = mediaCodecInfoZzb;
                                            if (zzban.zza <= 22) {
                                                str2 = zzban.zzd;
                                                if (str2.equals("ODROID-XU3")) {
                                                }
                                            } else {
                                                z = false;
                                            }
                                            boolean z10 = w16Var.b;
                                            if (!zZzd) {
                                                if (zZzd) {
                                                    continue;
                                                }
                                            } else if (zZzd) {
                                                continue;
                                            }
                                        } else {
                                            i3 = iZza;
                                            mediaCodecInfo = mediaCodecInfoZzb;
                                        }
                                        i2++;
                                        x16Var = x16Var;
                                        iZza = i3;
                                        mediaCodecInfoZzb = mediaCodecInfo;
                                    }
                                } else {
                                    supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                    length = supportedTypes.length;
                                    i2 = 0;
                                    while (i2 < length) {
                                        str = supportedTypes[i2];
                                        if (str.equalsIgnoreCase(str3)) {
                                            MediaCodecInfo.CodecCapabilities capabilitiesForType10 = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                            boolean zA10 = x16Var.a(str3, capabilitiesForType10);
                                            i3 = iZza;
                                            mediaCodecInfo = mediaCodecInfoZzb;
                                            if (zzban.zza <= 22) {
                                                str2 = zzban.zzd;
                                                if (str2.equals("ODROID-XU3")) {
                                                }
                                            } else {
                                                z = false;
                                            }
                                            boolean z11 = w16Var.b;
                                            if (!zZzd) {
                                                if (zZzd) {
                                                    continue;
                                                }
                                            } else if (zZzd) {
                                                continue;
                                            }
                                        } else {
                                            i3 = iZza;
                                            mediaCodecInfo = mediaCodecInfoZzb;
                                        }
                                        i2++;
                                        x16Var = x16Var;
                                        iZza = i3;
                                        mediaCodecInfoZzb = mediaCodecInfo;
                                    }
                                }
                            } else if (i <= 19) {
                                supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                length = supportedTypes.length;
                                i2 = 0;
                                while (i2 < length) {
                                    str = supportedTypes[i2];
                                    if (str.equalsIgnoreCase(str3)) {
                                        MediaCodecInfo.CodecCapabilities capabilitiesForType11 = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                        boolean zA11 = x16Var.a(str3, capabilitiesForType11);
                                        i3 = iZza;
                                        mediaCodecInfo = mediaCodecInfoZzb;
                                        if (zzban.zza <= 22) {
                                            str2 = zzban.zzd;
                                            if (str2.equals("ODROID-XU3")) {
                                            }
                                        } else {
                                            z = false;
                                        }
                                        boolean z12 = w16Var.b;
                                        if (!zZzd) {
                                            if (zZzd) {
                                                continue;
                                            }
                                        } else if (zZzd) {
                                            continue;
                                        }
                                    } else {
                                        i3 = iZza;
                                        mediaCodecInfo = mediaCodecInfoZzb;
                                    }
                                    i2++;
                                    x16Var = x16Var;
                                    iZza = i3;
                                    mediaCodecInfoZzb = mediaCodecInfo;
                                }
                            } else {
                                supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                length = supportedTypes.length;
                                i2 = 0;
                                while (i2 < length) {
                                    str = supportedTypes[i2];
                                    if (str.equalsIgnoreCase(str3)) {
                                        MediaCodecInfo.CodecCapabilities capabilitiesForType12 = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                        boolean zA12 = x16Var.a(str3, capabilitiesForType12);
                                        i3 = iZza;
                                        mediaCodecInfo = mediaCodecInfoZzb;
                                        if (zzban.zza <= 22) {
                                            str2 = zzban.zzd;
                                            if (str2.equals("ODROID-XU3")) {
                                            }
                                        } else {
                                            z = false;
                                        }
                                        boolean z13 = w16Var.b;
                                        if (!zZzd) {
                                            if (zZzd) {
                                                continue;
                                            }
                                        } else if (zZzd) {
                                            continue;
                                        }
                                    } else {
                                        i3 = iZza;
                                        mediaCodecInfo = mediaCodecInfoZzb;
                                    }
                                    i2++;
                                    x16Var = x16Var;
                                    iZza = i3;
                                    mediaCodecInfoZzb = mediaCodecInfo;
                                }
                            }
                        }
                    } else if (i > 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(zzban.zzc)) {
                        String str6 = zzban.zzb;
                        if (!str6.startsWith("d2") && !str6.startsWith("serrano") && !str6.startsWith("jflte") && !str6.startsWith("santos") && !str6.startsWith("t0")) {
                            if (i <= 19) {
                                supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                length = supportedTypes.length;
                                i2 = 0;
                                while (i2 < length) {
                                    str = supportedTypes[i2];
                                    if (str.equalsIgnoreCase(str3)) {
                                        MediaCodecInfo.CodecCapabilities capabilitiesForType13 = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                        boolean zA13 = x16Var.a(str3, capabilitiesForType13);
                                        i3 = iZza;
                                        mediaCodecInfo = mediaCodecInfoZzb;
                                        if (zzban.zza <= 22) {
                                            str2 = zzban.zzd;
                                            z = str2.equals("ODROID-XU3") ? true : true;
                                        } else {
                                            z = false;
                                        }
                                        boolean z14 = w16Var.b;
                                        if (!zZzd) {
                                            if (zZzd) {
                                                continue;
                                            }
                                        } else if (zZzd) {
                                            continue;
                                        }
                                    } else {
                                        i3 = iZza;
                                        mediaCodecInfo = mediaCodecInfoZzb;
                                    }
                                    i2++;
                                    x16Var = x16Var;
                                    iZza = i3;
                                    mediaCodecInfoZzb = mediaCodecInfo;
                                }
                            } else {
                                supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                length = supportedTypes.length;
                                i2 = 0;
                                while (i2 < length) {
                                    str = supportedTypes[i2];
                                    if (str.equalsIgnoreCase(str3)) {
                                        MediaCodecInfo.CodecCapabilities capabilitiesForType14 = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                        boolean zA14 = x16Var.a(str3, capabilitiesForType14);
                                        i3 = iZza;
                                        mediaCodecInfo = mediaCodecInfoZzb;
                                        if (zzban.zza <= 22) {
                                            str2 = zzban.zzd;
                                            if (str2.equals("ODROID-XU3")) {
                                            }
                                        } else {
                                            z = false;
                                        }
                                        boolean z15 = w16Var.b;
                                        if (!zZzd) {
                                            if (zZzd) {
                                                continue;
                                            }
                                        } else if (zZzd) {
                                            continue;
                                        }
                                    } else {
                                        i3 = iZza;
                                        mediaCodecInfo = mediaCodecInfoZzb;
                                    }
                                    i2++;
                                    x16Var = x16Var;
                                    iZza = i3;
                                    mediaCodecInfoZzb = mediaCodecInfo;
                                }
                            }
                        }
                    } else if (i <= 19 || !zzban.zzb.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)) {
                        supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        length = supportedTypes.length;
                        i2 = 0;
                        while (i2 < length) {
                            str = supportedTypes[i2];
                            if (str.equalsIgnoreCase(str3)) {
                                try {
                                    MediaCodecInfo.CodecCapabilities capabilitiesForType15 = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                    boolean zA15 = x16Var.a(str3, capabilitiesForType15);
                                    i3 = iZza;
                                    mediaCodecInfo = mediaCodecInfoZzb;
                                    if (zzban.zza <= 22) {
                                        try {
                                            str2 = zzban.zzd;
                                            if ((str2.equals("ODROID-XU3") && !str2.equals("Nexus 10")) || (!"OMX.Exynos.AVC.Decoder".equals(name) && !"OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                                z = false;
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            if (zzban.zza <= 23) {
                                            }
                                            Log.e("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                            throw e;
                                        }
                                    } else {
                                        z = false;
                                    }
                                    boolean z16 = w16Var.b;
                                    if ((!zZzd && z16 == zA15) || (!zZzd && !z16)) {
                                        try {
                                            arrayList.add(zzawo.zza(name, str3, capabilitiesForType15, z, false));
                                        } catch (Exception e3) {
                                            e = e3;
                                            if (zzban.zza <= 23 || arrayList.isEmpty()) {
                                                Log.e("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                                throw e;
                                            }
                                            Log.e("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                        }
                                    } else if (zZzd && zA15) {
                                        arrayList.add(zzawo.zza(name + ".secure", str3, capabilitiesForType15, z, true));
                                        return arrayList;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    i3 = iZza;
                                    mediaCodecInfo = mediaCodecInfoZzb;
                                }
                            } else {
                                i3 = iZza;
                                mediaCodecInfo = mediaCodecInfoZzb;
                            }
                            i2++;
                            x16Var = x16Var;
                            iZza = i3;
                            mediaCodecInfoZzb = mediaCodecInfo;
                        }
                    }
                }
                i4++;
                iZza = iZza;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new zzawv(e5);
        }
    }

    public static int zza() {
        int iMax = f;
        if (iMax == -1) {
            zzawo zzawoVarZzc = zzc("video/avc", false);
            if (zzawoVarZzc != null) {
                int iMax2 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzawoVarZzc.zzg()) {
                    int i = codecProfileLevel.level;
                    int i2 = 25344;
                    if (i != 1 && i != 2) {
                        i2 = 9437184;
                        switch (i) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case 64:
                                i2 = 202752;
                                break;
                            case 128:
                            case 256:
                                i2 = 414720;
                                break;
                            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                                i2 = 921600;
                                break;
                            case 1024:
                                i2 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i2 = 2097152;
                                break;
                            case 8192:
                                i2 = 2228224;
                                break;
                            case 16384:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    }
                    iMax2 = Math.max(i2, iMax2);
                }
                iMax = Math.max(iMax2, zzban.zza >= 21 ? 345600 : 172800);
            } else {
                iMax = 0;
            }
            f = iMax;
        }
        return iMax;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    public static Pair zzb(String str) {
        byte b2;
        Integer numValueOf;
        Integer numValueOf2;
        String[] strArrSplit = str.split("\\.");
        int i = 2;
        switch (strArrSplit[0]) {
            case "avc1":
                b2 = 2;
                break;
            case "avc2":
                b2 = 3;
                break;
            case "hev1":
                b2 = 0;
                break;
            case "hvc1":
                b2 = 1;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1) {
            if (strArrSplit.length < 4) {
                Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                return null;
            }
            Matcher matcher = a.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                return null;
            }
            String strGroup = matcher.group(1);
            if ("1".equals(strGroup)) {
                i = 1;
            } else if (!"2".equals(strGroup)) {
                Log.w("MediaCodecUtil", "Unknown HEVC profile string: ".concat(String.valueOf(strGroup)));
                return null;
            }
            Integer num = (Integer) e.get(strArrSplit[3]);
            if (num != null) {
                return new Pair(Integer.valueOf(i), num);
            }
            Log.w("MediaCodecUtil", "Unknown HEVC level string: ".concat(String.valueOf(matcher.group(1))));
            return null;
        }
        if (b2 != 2 && b2 != 3) {
            return null;
        }
        int length = strArrSplit.length;
        if (length < 2) {
            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
            return null;
        }
        try {
            if (strArrSplit[1].length() == 6) {
                numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(0, 2), 16));
                numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(4), 16));
            } else {
                if (length < 3) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                    return null;
                }
                numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[2]));
            }
            return new Pair(Integer.valueOf(c.get(numValueOf.intValue())), Integer.valueOf(d.get(numValueOf2.intValue())));
        } catch (NumberFormatException unused) {
            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
            return null;
        }
    }

    public static zzawo zzc(String str, boolean z) {
        List listZzd = zzd(str, z);
        if (listZzd.isEmpty()) {
            return null;
        }
        return (zzawo) listZzd.get(0);
    }

    public static synchronized List zzd(String str, boolean z) {
        w16 w16Var = new w16(str, z);
        HashMap map = b;
        List list = (List) map.get(w16Var);
        if (list != null) {
            return list;
        }
        int i = zzban.zza;
        ArrayList arrayListA = a(w16Var, i >= 21 ? new z16(z) : new y16());
        if (z && arrayListA.isEmpty() && i >= 21 && i <= 23) {
            arrayListA = a(w16Var, new y16());
            if (!arrayListA.isEmpty()) {
                Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzawo) arrayListA.get(0)).zza);
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayListA);
        map.put(w16Var, listUnmodifiableList);
        return listUnmodifiableList;
    }
}
