package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.cq4;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzza implements zzzm {
    public static final int[] a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final cq4 b = new cq4(new zzyy() { // from class: com.google.android.gms.internal.ads.zzyw
        @Override // com.google.android.gms.internal.ads.zzyy
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzzf.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    public static final cq4 c = new cq4(new zzyy() { // from class: com.google.android.gms.internal.ads.zzyx
        @Override // com.google.android.gms.internal.ads.zzyy
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzzf.class).getConstructor(new Class[0]);
        }
    });

    public static final void a(ArrayList arrayList, int i) {
        switch (i) {
            case 0:
                arrayList.add(new zzago());
                break;
            case 1:
                arrayList.add(new zzagr());
                break;
            case 2:
                arrayList.add(new zzagu(0));
                break;
            case 3:
                arrayList.add(new zzaau(0));
                break;
            case 4:
                zzzf zzzfVarK = b.k(0);
                if (zzzfVarK == null) {
                    arrayList.add(new zzabl(0));
                } else {
                    arrayList.add(zzzfVarK);
                }
                break;
            case 5:
                arrayList.add(new zzabo());
                break;
            case 6:
                arrayList.add(new zzaef(0));
                break;
            case 7:
                arrayList.add(new zzaen(0));
                break;
            case 8:
                arrayList.add(new zzafi(0, null));
                arrayList.add(new zzafn(0));
                break;
            case 9:
                arrayList.add(new zzagc());
                break;
            case 10:
                arrayList.add(new zzahx());
                break;
            case 11:
                arrayList.add(new zzaih(1, 0, 112800));
                break;
            case 12:
                arrayList.add(new zzait());
                break;
            case 14:
                arrayList.add(new zzabt());
                break;
            case 15:
                zzzf zzzfVarK2 = c.k(new Object[0]);
                if (zzzfVarK2 != null) {
                    arrayList.add(zzzfVarK2);
                }
                break;
            case 16:
                arrayList.add(new zzaaz());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final synchronized zzzf[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01a3 A[Catch: all -> 0x0343, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:115:0x01a3, B:116:0x01a6, B:216:0x0321, B:217:0x0324, B:219:0x0329, B:222:0x032f, B:223:0x0332, B:224:0x0335, B:119:0x01ae, B:121:0x01b6, B:124:0x01c0, B:127:0x01cb, B:129:0x01d3, B:132:0x01dd, B:135:0x01e8, B:138:0x01f3, B:141:0x01fe, B:143:0x0206, B:145:0x020e, B:148:0x0218, B:150:0x0226, B:153:0x0230, B:156:0x023b, B:158:0x0243, B:160:0x0251, B:162:0x025f, B:165:0x026f, B:167:0x027d, B:170:0x0287, B:172:0x028f, B:174:0x0297, B:176:0x029f, B:179:0x02a9, B:181:0x02b1, B:184:0x02c0, B:186:0x02c8, B:189:0x02d1, B:191:0x02d9, B:194:0x02e2, B:196:0x02ea, B:199:0x02f3, B:13:0x003e, B:14:0x0046, B:95:0x0173, B:16:0x004b, B:19:0x0057, B:22:0x0063, B:25:0x006f, B:28:0x007b, B:31:0x0086, B:34:0x0091, B:37:0x009c, B:40:0x00a8, B:43:0x00b4, B:46:0x00c0, B:49:0x00cc, B:52:0x00d7, B:55:0x00e2, B:58:0x00ed, B:61:0x00f9, B:64:0x0105, B:67:0x0111, B:70:0x011c, B:73:0x0127, B:76:0x0132, B:79:0x013d, B:82:0x0147, B:85:0x0152, B:88:0x015d, B:91:0x0168), top: B:230:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ae A[Catch: all -> 0x0343, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:115:0x01a3, B:116:0x01a6, B:216:0x0321, B:217:0x0324, B:219:0x0329, B:222:0x032f, B:223:0x0332, B:224:0x0335, B:119:0x01ae, B:121:0x01b6, B:124:0x01c0, B:127:0x01cb, B:129:0x01d3, B:132:0x01dd, B:135:0x01e8, B:138:0x01f3, B:141:0x01fe, B:143:0x0206, B:145:0x020e, B:148:0x0218, B:150:0x0226, B:153:0x0230, B:156:0x023b, B:158:0x0243, B:160:0x0251, B:162:0x025f, B:165:0x026f, B:167:0x027d, B:170:0x0287, B:172:0x028f, B:174:0x0297, B:176:0x029f, B:179:0x02a9, B:181:0x02b1, B:184:0x02c0, B:186:0x02c8, B:189:0x02d1, B:191:0x02d9, B:194:0x02e2, B:196:0x02ea, B:199:0x02f3, B:13:0x003e, B:14:0x0046, B:95:0x0173, B:16:0x004b, B:19:0x0057, B:22:0x0063, B:25:0x006f, B:28:0x007b, B:31:0x0086, B:34:0x0091, B:37:0x009c, B:40:0x00a8, B:43:0x00b4, B:46:0x00c0, B:49:0x00cc, B:52:0x00d7, B:55:0x00e2, B:58:0x00ed, B:61:0x00f9, B:64:0x0105, B:67:0x0111, B:70:0x011c, B:73:0x0127, B:76:0x0132, B:79:0x013d, B:82:0x0147, B:85:0x0152, B:88:0x015d, B:91:0x0168), top: B:230:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:213:0x031c  */
    /* JADX WARN: Code duplicated, block: B:215:0x031f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:219:0x0329 A[Catch: all -> 0x0343, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:115:0x01a3, B:116:0x01a6, B:216:0x0321, B:217:0x0324, B:219:0x0329, B:222:0x032f, B:223:0x0332, B:224:0x0335, B:119:0x01ae, B:121:0x01b6, B:124:0x01c0, B:127:0x01cb, B:129:0x01d3, B:132:0x01dd, B:135:0x01e8, B:138:0x01f3, B:141:0x01fe, B:143:0x0206, B:145:0x020e, B:148:0x0218, B:150:0x0226, B:153:0x0230, B:156:0x023b, B:158:0x0243, B:160:0x0251, B:162:0x025f, B:165:0x026f, B:167:0x027d, B:170:0x0287, B:172:0x028f, B:174:0x0297, B:176:0x029f, B:179:0x02a9, B:181:0x02b1, B:184:0x02c0, B:186:0x02c8, B:189:0x02d1, B:191:0x02d9, B:194:0x02e2, B:196:0x02ea, B:199:0x02f3, B:13:0x003e, B:14:0x0046, B:95:0x0173, B:16:0x004b, B:19:0x0057, B:22:0x0063, B:25:0x006f, B:28:0x007b, B:31:0x0086, B:34:0x0091, B:37:0x009c, B:40:0x00a8, B:43:0x00b4, B:46:0x00c0, B:49:0x00cc, B:52:0x00d7, B:55:0x00e2, B:58:0x00ed, B:61:0x00f9, B:64:0x0105, B:67:0x0111, B:70:0x011c, B:73:0x0127, B:76:0x0132, B:79:0x013d, B:82:0x0147, B:85:0x0152, B:88:0x015d, B:91:0x0168), top: B:230:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x032d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:234:0x0332 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0172  */
    @Override // com.google.android.gms.internal.ads.zzzm
    public final synchronized zzzf[] zzb(Uri uri, Map map) {
        ArrayList arrayList;
        int i;
        String lastPathSegment;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        arrayList = new ArrayList(16);
        List list = (List) map.get("Content-Type");
        String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
        if (str != null) {
            switch (zzbt.zze(str)) {
                case "audio/ac3":
                case "audio/eac3":
                case "audio/eac3-joc":
                    i = 0;
                    break;
                case "audio/ac4":
                    i = 1;
                    break;
                case "audio/amr":
                case "audio/3gpp":
                case "audio/amr-wb":
                    i = 3;
                    break;
                case "audio/flac":
                    i = 4;
                    break;
                case "video/x-flv":
                    i = 5;
                    break;
                case "audio/midi":
                    i = 15;
                    break;
                case "video/x-matroska":
                case "audio/x-matroska":
                case "video/webm":
                case "audio/webm":
                case "application/webm":
                    i = 6;
                    break;
                case "audio/mpeg":
                    i = 7;
                    break;
                case "video/mp4":
                case "audio/mp4":
                case "application/mp4":
                    i = 8;
                    break;
                case "audio/ogg":
                    i = 9;
                    break;
                case "video/mp2p":
                    i = 10;
                    break;
                case "video/mp2t":
                    i = 11;
                    break;
                case "audio/wav":
                    i = 12;
                    break;
                case "text/vtt":
                    i = 13;
                    break;
                case "image/jpeg":
                    i = 14;
                    break;
                case "video/x-msvideo":
                    i = 16;
                    break;
                default:
                    break;
            }
            if (i != -1) {
                a(arrayList, i);
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                if (!lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                    i2 = 0;
                } else if (lastPathSegment.endsWith(".ac4")) {
                    i2 = 1;
                } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                    i2 = 2;
                } else if (lastPathSegment.endsWith(".amr")) {
                    i2 = 3;
                } else if (lastPathSegment.endsWith(".flac")) {
                    i2 = 4;
                } else if (lastPathSegment.endsWith(".flv")) {
                    i2 = 5;
                } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                    i2 = 15;
                } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                    i2 = 6;
                } else if (lastPathSegment.endsWith(".mp3")) {
                    i2 = 7;
                } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                    i2 = 8;
                } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                    i2 = 9;
                } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                    i2 = 10;
                } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                    i2 = 11;
                } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                    i2 = 12;
                } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                    i2 = 13;
                } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                    i2 = 14;
                } else if (lastPathSegment.endsWith(".avi")) {
                    i2 = 16;
                }
                if (i2 != -1 && i2 != i) {
                    a(arrayList, i2);
                }
                iArr = a;
                for (i3 = 0; i3 < 16; i3++) {
                    i4 = iArr[i3];
                    if (i4 == i && i4 != i2) {
                        a(arrayList, i4);
                    }
                }
            }
            i2 = -1;
            if (i2 != -1) {
                a(arrayList, i2);
            }
            iArr = a;
            while (i3 < 16) {
                i4 = iArr[i3];
                if (i4 == i) {
                }
            }
        }
        i = -1;
        if (i != -1) {
            a(arrayList, i);
        }
        lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            if (lastPathSegment.endsWith(".ac3")) {
                i2 = 0;
            } else {
                i2 = 0;
            }
            if (i2 != -1) {
                a(arrayList, i2);
            }
            iArr = a;
            while (i3 < 16) {
                i4 = iArr[i3];
                if (i4 == i) {
                }
            }
        }
        i2 = -1;
        if (i2 != -1) {
            a(arrayList, i2);
        }
        iArr = a;
        while (i3 < 16) {
            i4 = iArr[i3];
            if (i4 == i) {
            }
        }
        return (zzzf[]) arrayList.toArray(new zzzf[arrayList.size()]);
    }
}
