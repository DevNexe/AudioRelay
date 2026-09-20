package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import defpackage.bj0;
import defpackage.ia7;
import defpackage.ja7;
import defpackage.ka7;
import defpackage.y97;
import defpackage.z97;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"InlinedApi"})
public final class zzrd {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;
    public static final /* synthetic */ int zza = 0;

    /* JADX WARN: Code duplicated, block: B:102:0x018b A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0032, B:14:0x0040, B:18:0x004a, B:20:0x0052, B:22:0x005a, B:24:0x0062, B:26:0x006a, B:28:0x0072, B:32:0x0080, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:40:0x00a2, B:42:0x00aa, B:44:0x00b2, B:46:0x00ba, B:48:0x00c2, B:50:0x00ca, B:52:0x00d2, B:56:0x00e0, B:58:0x00e8, B:60:0x00f0, B:62:0x00fa, B:64:0x0102, B:66:0x0108, B:68:0x0110, B:71:0x011a, B:73:0x0122, B:77:0x012e, B:79:0x0136, B:81:0x013e, B:83:0x0146, B:174:0x0298, B:177:0x02a0, B:179:0x02a6, B:180:0x02c0, B:181:0x02e1, B:86:0x014f, B:87:0x0152, B:89:0x015a, B:92:0x0165, B:94:0x016d, B:97:0x0178, B:99:0x0180, B:102:0x018b, B:104:0x0193, B:107:0x019e, B:109:0x01a6), top: B:187:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0193 A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0032, B:14:0x0040, B:18:0x004a, B:20:0x0052, B:22:0x005a, B:24:0x0062, B:26:0x006a, B:28:0x0072, B:32:0x0080, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:40:0x00a2, B:42:0x00aa, B:44:0x00b2, B:46:0x00ba, B:48:0x00c2, B:50:0x00ca, B:52:0x00d2, B:56:0x00e0, B:58:0x00e8, B:60:0x00f0, B:62:0x00fa, B:64:0x0102, B:66:0x0108, B:68:0x0110, B:71:0x011a, B:73:0x0122, B:77:0x012e, B:79:0x0136, B:81:0x013e, B:83:0x0146, B:174:0x0298, B:177:0x02a0, B:179:0x02a6, B:180:0x02c0, B:181:0x02e1, B:86:0x014f, B:87:0x0152, B:89:0x015a, B:92:0x0165, B:94:0x016d, B:97:0x0178, B:99:0x0180, B:102:0x018b, B:104:0x0193, B:107:0x019e, B:109:0x01a6), top: B:187:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x019e A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0032, B:14:0x0040, B:18:0x004a, B:20:0x0052, B:22:0x005a, B:24:0x0062, B:26:0x006a, B:28:0x0072, B:32:0x0080, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:40:0x00a2, B:42:0x00aa, B:44:0x00b2, B:46:0x00ba, B:48:0x00c2, B:50:0x00ca, B:52:0x00d2, B:56:0x00e0, B:58:0x00e8, B:60:0x00f0, B:62:0x00fa, B:64:0x0102, B:66:0x0108, B:68:0x0110, B:71:0x011a, B:73:0x0122, B:77:0x012e, B:79:0x0136, B:81:0x013e, B:83:0x0146, B:174:0x0298, B:177:0x02a0, B:179:0x02a6, B:180:0x02c0, B:181:0x02e1, B:86:0x014f, B:87:0x0152, B:89:0x015a, B:92:0x0165, B:94:0x016d, B:97:0x0178, B:99:0x0180, B:102:0x018b, B:104:0x0193, B:107:0x019e, B:109:0x01a6), top: B:187:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01a6 A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0032, B:14:0x0040, B:18:0x004a, B:20:0x0052, B:22:0x005a, B:24:0x0062, B:26:0x006a, B:28:0x0072, B:32:0x0080, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:40:0x00a2, B:42:0x00aa, B:44:0x00b2, B:46:0x00ba, B:48:0x00c2, B:50:0x00ca, B:52:0x00d2, B:56:0x00e0, B:58:0x00e8, B:60:0x00f0, B:62:0x00fa, B:64:0x0102, B:66:0x0108, B:68:0x0110, B:71:0x011a, B:73:0x0122, B:77:0x012e, B:79:0x0136, B:81:0x013e, B:83:0x0146, B:174:0x0298, B:177:0x02a0, B:179:0x02a6, B:180:0x02c0, B:181:0x02e1, B:86:0x014f, B:87:0x0152, B:89:0x015a, B:92:0x0165, B:94:0x016d, B:97:0x0178, B:99:0x0180, B:102:0x018b, B:104:0x0193, B:107:0x019e, B:109:0x01a6), top: B:187:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01b1 A[EDGE_INSN: B:113:0x01b1->B:114:0x01b2 BREAK  A[LOOP:1: B:82:0x0144->B:86:0x014f]] */
    /* JADX WARN: Code duplicated, block: B:117:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cb A[Catch: Exception -> 0x0291, TRY_LEAVE, TryCatch #5 {Exception -> 0x0291, blocks: (B:115:0x01b4, B:121:0x01cb, B:128:0x01dd, B:130:0x01e3, B:135:0x01f1, B:137:0x01f9, B:138:0x01fe, B:140:0x020e, B:142:0x0216, B:131:0x01e8), top: B:197:0x01b4 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x01da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:128:0x01dd A[Catch: Exception -> 0x0291, PHI: r6
  0x01dd: PHI (r6v27 boolean) = (r6v26 boolean), (r6v25 boolean) binds: [B:127:0x01dc, B:124:0x01d7] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #5 {Exception -> 0x0291, blocks: (B:115:0x01b4, B:121:0x01cb, B:128:0x01dd, B:130:0x01e3, B:135:0x01f1, B:137:0x01f9, B:138:0x01fe, B:140:0x020e, B:142:0x0216, B:131:0x01e8), top: B:197:0x01b4 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x01e3 A[Catch: Exception -> 0x0291, TryCatch #5 {Exception -> 0x0291, blocks: (B:115:0x01b4, B:121:0x01cb, B:128:0x01dd, B:130:0x01e3, B:135:0x01f1, B:137:0x01f9, B:138:0x01fe, B:140:0x020e, B:142:0x0216, B:131:0x01e8), top: B:197:0x01b4 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x01e8 A[Catch: Exception -> 0x0291, TryCatch #5 {Exception -> 0x0291, blocks: (B:115:0x01b4, B:121:0x01cb, B:128:0x01dd, B:130:0x01e3, B:135:0x01f1, B:137:0x01f9, B:138:0x01fe, B:140:0x020e, B:142:0x0216, B:131:0x01e8), top: B:197:0x01b4 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f9 A[Catch: Exception -> 0x0291, TryCatch #5 {Exception -> 0x0291, blocks: (B:115:0x01b4, B:121:0x01cb, B:128:0x01dd, B:130:0x01e3, B:135:0x01f1, B:137:0x01f9, B:138:0x01fe, B:140:0x020e, B:142:0x0216, B:131:0x01e8), top: B:197:0x01b4 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x01fe A[Catch: Exception -> 0x0291, TryCatch #5 {Exception -> 0x0291, blocks: (B:115:0x01b4, B:121:0x01cb, B:128:0x01dd, B:130:0x01e3, B:135:0x01f1, B:137:0x01f9, B:138:0x01fe, B:140:0x020e, B:142:0x0216, B:131:0x01e8), top: B:197:0x01b4 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x020e A[Catch: Exception -> 0x0291, TryCatch #5 {Exception -> 0x0291, blocks: (B:115:0x01b4, B:121:0x01cb, B:128:0x01dd, B:130:0x01e3, B:135:0x01f1, B:137:0x01f9, B:138:0x01fe, B:140:0x020e, B:142:0x0216, B:131:0x01e8), top: B:197:0x01b4 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0220  */
    /* JADX WARN: Code duplicated, block: B:147:0x0223 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x02a0 A[Catch: Exception -> 0x02ed, TRY_ENTER, TryCatch #0 {Exception -> 0x02ed, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0032, B:14:0x0040, B:18:0x004a, B:20:0x0052, B:22:0x005a, B:24:0x0062, B:26:0x006a, B:28:0x0072, B:32:0x0080, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:40:0x00a2, B:42:0x00aa, B:44:0x00b2, B:46:0x00ba, B:48:0x00c2, B:50:0x00ca, B:52:0x00d2, B:56:0x00e0, B:58:0x00e8, B:60:0x00f0, B:62:0x00fa, B:64:0x0102, B:66:0x0108, B:68:0x0110, B:71:0x011a, B:73:0x0122, B:77:0x012e, B:79:0x0136, B:81:0x013e, B:83:0x0146, B:174:0x0298, B:177:0x02a0, B:179:0x02a6, B:180:0x02c0, B:181:0x02e1, B:86:0x014f, B:87:0x0152, B:89:0x015a, B:92:0x0165, B:94:0x016d, B:97:0x0178, B:99:0x0180, B:102:0x018b, B:104:0x0193, B:107:0x019e, B:109:0x01a6), top: B:187:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x02c0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00da  */
    /* JADX WARN: Code duplicated, block: B:70:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x011a A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0032, B:14:0x0040, B:18:0x004a, B:20:0x0052, B:22:0x005a, B:24:0x0062, B:26:0x006a, B:28:0x0072, B:32:0x0080, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:40:0x00a2, B:42:0x00aa, B:44:0x00b2, B:46:0x00ba, B:48:0x00c2, B:50:0x00ca, B:52:0x00d2, B:56:0x00e0, B:58:0x00e8, B:60:0x00f0, B:62:0x00fa, B:64:0x0102, B:66:0x0108, B:68:0x0110, B:71:0x011a, B:73:0x0122, B:77:0x012e, B:79:0x0136, B:81:0x013e, B:83:0x0146, B:174:0x0298, B:177:0x02a0, B:179:0x02a6, B:180:0x02c0, B:181:0x02e1, B:86:0x014f, B:87:0x0152, B:89:0x015a, B:92:0x0165, B:94:0x016d, B:97:0x0178, B:99:0x0180, B:102:0x018b, B:104:0x0193, B:107:0x019e, B:109:0x01a6), top: B:187:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x012a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0146 A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0032, B:14:0x0040, B:18:0x004a, B:20:0x0052, B:22:0x005a, B:24:0x0062, B:26:0x006a, B:28:0x0072, B:32:0x0080, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:40:0x00a2, B:42:0x00aa, B:44:0x00b2, B:46:0x00ba, B:48:0x00c2, B:50:0x00ca, B:52:0x00d2, B:56:0x00e0, B:58:0x00e8, B:60:0x00f0, B:62:0x00fa, B:64:0x0102, B:66:0x0108, B:68:0x0110, B:71:0x011a, B:73:0x0122, B:77:0x012e, B:79:0x0136, B:81:0x013e, B:83:0x0146, B:174:0x0298, B:177:0x02a0, B:179:0x02a6, B:180:0x02c0, B:181:0x02e1, B:86:0x014f, B:87:0x0152, B:89:0x015a, B:92:0x0165, B:94:0x016d, B:97:0x0178, B:99:0x0180, B:102:0x018b, B:104:0x0193, B:107:0x019e, B:109:0x01a6), top: B:187:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x014f A[Catch: Exception -> 0x02ed, LOOP:1: B:82:0x0144->B:86:0x014f, LOOP_END, TryCatch #0 {Exception -> 0x02ed, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0032, B:14:0x0040, B:18:0x004a, B:20:0x0052, B:22:0x005a, B:24:0x0062, B:26:0x006a, B:28:0x0072, B:32:0x0080, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:40:0x00a2, B:42:0x00aa, B:44:0x00b2, B:46:0x00ba, B:48:0x00c2, B:50:0x00ca, B:52:0x00d2, B:56:0x00e0, B:58:0x00e8, B:60:0x00f0, B:62:0x00fa, B:64:0x0102, B:66:0x0108, B:68:0x0110, B:71:0x011a, B:73:0x0122, B:77:0x012e, B:79:0x0136, B:81:0x013e, B:83:0x0146, B:174:0x0298, B:177:0x02a0, B:179:0x02a6, B:180:0x02c0, B:181:0x02e1, B:86:0x014f, B:87:0x0152, B:89:0x015a, B:92:0x0165, B:94:0x016d, B:97:0x0178, B:99:0x0180, B:102:0x018b, B:104:0x0193, B:107:0x019e, B:109:0x01a6), top: B:187:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x015a A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0032, B:14:0x0040, B:18:0x004a, B:20:0x0052, B:22:0x005a, B:24:0x0062, B:26:0x006a, B:28:0x0072, B:32:0x0080, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:40:0x00a2, B:42:0x00aa, B:44:0x00b2, B:46:0x00ba, B:48:0x00c2, B:50:0x00ca, B:52:0x00d2, B:56:0x00e0, B:58:0x00e8, B:60:0x00f0, B:62:0x00fa, B:64:0x0102, B:66:0x0108, B:68:0x0110, B:71:0x011a, B:73:0x0122, B:77:0x012e, B:79:0x0136, B:81:0x013e, B:83:0x0146, B:174:0x0298, B:177:0x02a0, B:179:0x02a6, B:180:0x02c0, B:181:0x02e1, B:86:0x014f, B:87:0x0152, B:89:0x015a, B:92:0x0165, B:94:0x016d, B:97:0x0178, B:99:0x0180, B:102:0x018b, B:104:0x0193, B:107:0x019e, B:109:0x01a6), top: B:187:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0162 A[EDGE_INSN: B:91:0x0162->B:114:0x01b2 BREAK  A[LOOP:1: B:82:0x0144->B:86:0x014f]] */
    /* JADX WARN: Code duplicated, block: B:92:0x0165 A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0032, B:14:0x0040, B:18:0x004a, B:20:0x0052, B:22:0x005a, B:24:0x0062, B:26:0x006a, B:28:0x0072, B:32:0x0080, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:40:0x00a2, B:42:0x00aa, B:44:0x00b2, B:46:0x00ba, B:48:0x00c2, B:50:0x00ca, B:52:0x00d2, B:56:0x00e0, B:58:0x00e8, B:60:0x00f0, B:62:0x00fa, B:64:0x0102, B:66:0x0108, B:68:0x0110, B:71:0x011a, B:73:0x0122, B:77:0x012e, B:79:0x0136, B:81:0x013e, B:83:0x0146, B:174:0x0298, B:177:0x02a0, B:179:0x02a6, B:180:0x02c0, B:181:0x02e1, B:86:0x014f, B:87:0x0152, B:89:0x015a, B:92:0x0165, B:94:0x016d, B:97:0x0178, B:99:0x0180, B:102:0x018b, B:104:0x0193, B:107:0x019e, B:109:0x01a6), top: B:187:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x016d A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0032, B:14:0x0040, B:18:0x004a, B:20:0x0052, B:22:0x005a, B:24:0x0062, B:26:0x006a, B:28:0x0072, B:32:0x0080, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:40:0x00a2, B:42:0x00aa, B:44:0x00b2, B:46:0x00ba, B:48:0x00c2, B:50:0x00ca, B:52:0x00d2, B:56:0x00e0, B:58:0x00e8, B:60:0x00f0, B:62:0x00fa, B:64:0x0102, B:66:0x0108, B:68:0x0110, B:71:0x011a, B:73:0x0122, B:77:0x012e, B:79:0x0136, B:81:0x013e, B:83:0x0146, B:174:0x0298, B:177:0x02a0, B:179:0x02a6, B:180:0x02c0, B:181:0x02e1, B:86:0x014f, B:87:0x0152, B:89:0x015a, B:92:0x0165, B:94:0x016d, B:97:0x0178, B:99:0x0180, B:102:0x018b, B:104:0x0193, B:107:0x019e, B:109:0x01a6), top: B:187:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0178 A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0032, B:14:0x0040, B:18:0x004a, B:20:0x0052, B:22:0x005a, B:24:0x0062, B:26:0x006a, B:28:0x0072, B:32:0x0080, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:40:0x00a2, B:42:0x00aa, B:44:0x00b2, B:46:0x00ba, B:48:0x00c2, B:50:0x00ca, B:52:0x00d2, B:56:0x00e0, B:58:0x00e8, B:60:0x00f0, B:62:0x00fa, B:64:0x0102, B:66:0x0108, B:68:0x0110, B:71:0x011a, B:73:0x0122, B:77:0x012e, B:79:0x0136, B:81:0x013e, B:83:0x0146, B:174:0x0298, B:177:0x02a0, B:179:0x02a6, B:180:0x02c0, B:181:0x02e1, B:86:0x014f, B:87:0x0152, B:89:0x015a, B:92:0x0165, B:94:0x016d, B:97:0x0178, B:99:0x0180, B:102:0x018b, B:104:0x0193, B:107:0x019e, B:109:0x01a6), top: B:187:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0180 A[Catch: Exception -> 0x02ed, TryCatch #0 {Exception -> 0x02ed, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0032, B:14:0x0040, B:18:0x004a, B:20:0x0052, B:22:0x005a, B:24:0x0062, B:26:0x006a, B:28:0x0072, B:32:0x0080, B:34:0x0088, B:36:0x0090, B:38:0x0098, B:40:0x00a2, B:42:0x00aa, B:44:0x00b2, B:46:0x00ba, B:48:0x00c2, B:50:0x00ca, B:52:0x00d2, B:56:0x00e0, B:58:0x00e8, B:60:0x00f0, B:62:0x00fa, B:64:0x0102, B:66:0x0108, B:68:0x0110, B:71:0x011a, B:73:0x0122, B:77:0x012e, B:79:0x0136, B:81:0x013e, B:83:0x0146, B:174:0x0298, B:177:0x02a0, B:179:0x02a6, B:180:0x02c0, B:181:0x02e1, B:86:0x014f, B:87:0x0152, B:89:0x015a, B:92:0x0165, B:94:0x016d, B:97:0x0178, B:99:0x0180, B:102:0x018b, B:104:0x0193, B:107:0x019e, B:109:0x01a6), top: B:187:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public static ArrayList a(y97 y97Var, z97 z97Var) throws zzqx {
        String[] supportedTypes;
        int length;
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        int i3;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zB;
        boolean zA;
        boolean zB2;
        boolean zA2;
        boolean z;
        int i4;
        boolean zIsHardwareAccelerated;
        boolean zB3;
        String strZza;
        boolean zIsVendor;
        String str4;
        int i5;
        String str5;
        y97 y97Var2 = y97Var;
        try {
            ArrayList arrayList = new ArrayList();
            String str6 = y97Var2.a;
            boolean zZze = z97Var.zze();
            int i6 = 0;
            for (int iZza = z97Var.zza(); i6 < iZza; iZza = i3) {
                MediaCodecInfo mediaCodecInfoZzb = z97Var.zzb(i6);
                int i7 = zzel.zza;
                if (i7 < 29 || !mediaCodecInfoZzb.isAlias()) {
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || ((!zZze && name.endsWith(".secure")) || (i7 < 21 && ("CIPAACDecoder".equals(name) || "CIPMP3Decoder".equals(name) || "CIPVorbisDecoder".equals(name) || "CIPAMRNBDecoder".equals(name) || "AACDecoder".equals(name) || "MP3Decoder".equals(name))))) {
                        i2 = i6;
                        i3 = iZza;
                    } else if (i7 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(zzel.zzc))) {
                        String str7 = zzel.zzb;
                        if (str7.startsWith("zeroflte") || str7.startsWith("zerolte") || str7.startsWith("zenlte") || "SC-05G".equals(str7) || "marinelteatt".equals(str7) || "404SC".equals(str7) || "SC-04G".equals(str7) || "SCV31".equals(str7)) {
                            i2 = i6;
                            i3 = iZza;
                        } else if (i7 > 19) {
                            if (i7 > 19) {
                                supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                length = supportedTypes.length;
                                i = 0;
                                while (true) {
                                    if (i >= length) {
                                        if (!str6.equals("video/dolby-vision")) {
                                            if (!str6.equals("audio/alac")) {
                                                if (!str6.equals("audio/flac")) {
                                                    if (!str6.equals("audio/ac3")) {
                                                        str = null;
                                                        break;
                                                    }
                                                    str = null;
                                                    break;
                                                }
                                                if (!str6.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str6.equals("audio/flac")) {
                                                if (!str6.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str6.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                            if ("OMX.RTK.video.decoder".equals(name)) {
                                            }
                                            str = "video/dv_hevc";
                                            break;
                                        }
                                        str = "video/hevcdv";
                                        break;
                                    }
                                    str = supportedTypes[i];
                                    if (str.equalsIgnoreCase(str6)) {
                                        break;
                                        break;
                                    }
                                    i++;
                                }
                                if (str != null) {
                                    capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                    zB = z97Var.b("tunneled-playback", str, capabilitiesForType);
                                    zA = z97Var.a("tunneled-playback", capabilitiesForType);
                                    if (y97Var2.c) {
                                        if (zB) {
                                            zB2 = z97Var.b("secure-playback", str, capabilitiesForType);
                                            zA2 = z97Var.a("secure-playback", capabilitiesForType);
                                            z = y97Var2.b;
                                            if (z) {
                                                if (zB2) {
                                                    zB2 = true;
                                                    i4 = zzel.zza;
                                                    if (i4 >= 29) {
                                                        zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                    } else if (b(mediaCodecInfoZzb, str6)) {
                                                        zIsHardwareAccelerated = false;
                                                    } else {
                                                        zIsHardwareAccelerated = true;
                                                    }
                                                    zB3 = b(mediaCodecInfoZzb, str6);
                                                    if (i4 >= 29) {
                                                        zIsVendor = mediaCodecInfoZzb.isVendor();
                                                    } else {
                                                        strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                        if (strZza.startsWith("omx.google.")) {
                                                            zIsVendor = false;
                                                        } else {
                                                            zIsVendor = false;
                                                        }
                                                    }
                                                    if (zZze) {
                                                        str4 = name;
                                                        i2 = i6;
                                                        i5 = iZza;
                                                        str5 = str;
                                                        if (!zZze) {
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append(str4);
                                                            sb.append(".secure");
                                                            boolean z2 = zIsHardwareAccelerated;
                                                            str3 = str4;
                                                            i3 = i5;
                                                            str2 = str5;
                                                            arrayList.add(zzql.zzc(sb.toString(), str6, str5, capabilitiesForType, z2, zB3, zIsVendor, false, true));
                                                            return arrayList;
                                                        }
                                                        i3 = i5;
                                                    } else {
                                                        str4 = name;
                                                        i2 = i6;
                                                        i5 = iZza;
                                                        str5 = str;
                                                        if (!zZze) {
                                                            StringBuilder sb2 = new StringBuilder();
                                                            sb2.append(str4);
                                                            sb2.append(".secure");
                                                            boolean z3 = zIsHardwareAccelerated;
                                                            str3 = str4;
                                                            i3 = i5;
                                                            str2 = str5;
                                                            arrayList.add(zzql.zzc(sb2.toString(), str6, str5, capabilitiesForType, z3, zB3, zIsVendor, false, true));
                                                            return arrayList;
                                                        }
                                                        i3 = i5;
                                                    }
                                                }
                                            } else if (!zA2) {
                                                i4 = zzel.zza;
                                                if (i4 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (b(mediaCodecInfoZzb, str6)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zB3 = b(mediaCodecInfoZzb, str6);
                                                if (i4 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb3 = new StringBuilder();
                                                        sb3.append(str4);
                                                        sb3.append(".secure");
                                                        boolean z4 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb3.toString(), str6, str5, capabilitiesForType, z4, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                } else {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb4 = new StringBuilder();
                                                        sb4.append(str4);
                                                        sb4.append(".secure");
                                                        boolean z5 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb4.toString(), str6, str5, capabilitiesForType, z5, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                }
                                            }
                                        }
                                    } else if (!zA) {
                                        zB2 = z97Var.b("secure-playback", str, capabilitiesForType);
                                        zA2 = z97Var.a("secure-playback", capabilitiesForType);
                                        z = y97Var2.b;
                                        if (z) {
                                            if (!zA2) {
                                                i4 = zzel.zza;
                                                if (i4 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (b(mediaCodecInfoZzb, str6)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zB3 = b(mediaCodecInfoZzb, str6);
                                                if (i4 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb5 = new StringBuilder();
                                                        sb5.append(str4);
                                                        sb5.append(".secure");
                                                        boolean z6 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb5.toString(), str6, str5, capabilitiesForType, z6, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                } else {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb6 = new StringBuilder();
                                                        sb6.append(str4);
                                                        sb6.append(".secure");
                                                        boolean z7 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb6.toString(), str6, str5, capabilitiesForType, z7, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                }
                                            }
                                        } else if (zB2) {
                                            zB2 = true;
                                            i4 = zzel.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (b(mediaCodecInfoZzb, str6)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zB3 = b(mediaCodecInfoZzb, str6);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb7 = new StringBuilder();
                                                    sb7.append(str4);
                                                    sb7.append(".secure");
                                                    boolean z8 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb7.toString(), str6, str5, capabilitiesForType, z8, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            } else {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb8 = new StringBuilder();
                                                    sb8.append(str4);
                                                    sb8.append(".secure");
                                                    boolean z9 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb8.toString(), str6, str5, capabilitiesForType, z9, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            }
                                        }
                                    }
                                    i2 = i6;
                                    i3 = iZza;
                                } else {
                                    i2 = i6;
                                    i3 = iZza;
                                }
                            } else {
                                supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                                length = supportedTypes.length;
                                i = 0;
                                while (true) {
                                    if (i >= length) {
                                        if (!str6.equals("video/dolby-vision")) {
                                            if (!str6.equals("audio/alac")) {
                                                if (!str6.equals("audio/flac")) {
                                                    if (!str6.equals("audio/ac3")) {
                                                        str = null;
                                                        break;
                                                    }
                                                    str = null;
                                                    break;
                                                }
                                                if (!str6.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str6.equals("audio/flac")) {
                                                if (!str6.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str6.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                            if ("OMX.RTK.video.decoder".equals(name)) {
                                            }
                                            str = "video/dv_hevc";
                                            break;
                                        }
                                        str = "video/hevcdv";
                                        break;
                                    }
                                    str = supportedTypes[i];
                                    if (str.equalsIgnoreCase(str6)) {
                                        break;
                                        break;
                                    }
                                    i++;
                                }
                                if (str != null) {
                                    capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                    zB = z97Var.b("tunneled-playback", str, capabilitiesForType);
                                    zA = z97Var.a("tunneled-playback", capabilitiesForType);
                                    if (y97Var2.c) {
                                        if (!zA) {
                                            zB2 = z97Var.b("secure-playback", str, capabilitiesForType);
                                            zA2 = z97Var.a("secure-playback", capabilitiesForType);
                                            z = y97Var2.b;
                                            if (z) {
                                                if (!zA2) {
                                                    i4 = zzel.zza;
                                                    if (i4 >= 29) {
                                                        zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                    } else if (b(mediaCodecInfoZzb, str6)) {
                                                        zIsHardwareAccelerated = true;
                                                    } else {
                                                        zIsHardwareAccelerated = false;
                                                    }
                                                    zB3 = b(mediaCodecInfoZzb, str6);
                                                    if (i4 >= 29) {
                                                        zIsVendor = mediaCodecInfoZzb.isVendor();
                                                    } else {
                                                        strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                        if (strZza.startsWith("omx.google.")) {
                                                            zIsVendor = false;
                                                        } else {
                                                            zIsVendor = false;
                                                        }
                                                    }
                                                    if (zZze) {
                                                        str4 = name;
                                                        i2 = i6;
                                                        i5 = iZza;
                                                        str5 = str;
                                                        if (!zZze) {
                                                            StringBuilder sb9 = new StringBuilder();
                                                            sb9.append(str4);
                                                            sb9.append(".secure");
                                                            boolean z10 = zIsHardwareAccelerated;
                                                            str3 = str4;
                                                            i3 = i5;
                                                            str2 = str5;
                                                            arrayList.add(zzql.zzc(sb9.toString(), str6, str5, capabilitiesForType, z10, zB3, zIsVendor, false, true));
                                                            return arrayList;
                                                        }
                                                        i3 = i5;
                                                    } else {
                                                        str4 = name;
                                                        i2 = i6;
                                                        i5 = iZza;
                                                        str5 = str;
                                                        if (!zZze) {
                                                            StringBuilder sb10 = new StringBuilder();
                                                            sb10.append(str4);
                                                            sb10.append(".secure");
                                                            boolean z11 = zIsHardwareAccelerated;
                                                            str3 = str4;
                                                            i3 = i5;
                                                            str2 = str5;
                                                            arrayList.add(zzql.zzc(sb10.toString(), str6, str5, capabilitiesForType, z11, zB3, zIsVendor, false, true));
                                                            return arrayList;
                                                        }
                                                        i3 = i5;
                                                    }
                                                }
                                            } else if (zB2) {
                                                zB2 = true;
                                                i4 = zzel.zza;
                                                if (i4 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (b(mediaCodecInfoZzb, str6)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zB3 = b(mediaCodecInfoZzb, str6);
                                                if (i4 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb11 = new StringBuilder();
                                                        sb11.append(str4);
                                                        sb11.append(".secure");
                                                        boolean z12 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb11.toString(), str6, str5, capabilitiesForType, z12, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                } else {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb12 = new StringBuilder();
                                                        sb12.append(str4);
                                                        sb12.append(".secure");
                                                        boolean z13 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb12.toString(), str6, str5, capabilitiesForType, z13, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                }
                                            }
                                        }
                                    } else if (zB) {
                                        zB2 = z97Var.b("secure-playback", str, capabilitiesForType);
                                        zA2 = z97Var.a("secure-playback", capabilitiesForType);
                                        z = y97Var2.b;
                                        if (z) {
                                            if (!zA2) {
                                                i4 = zzel.zza;
                                                if (i4 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (b(mediaCodecInfoZzb, str6)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zB3 = b(mediaCodecInfoZzb, str6);
                                                if (i4 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb13 = new StringBuilder();
                                                        sb13.append(str4);
                                                        sb13.append(".secure");
                                                        boolean z14 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb13.toString(), str6, str5, capabilitiesForType, z14, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                } else {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb14 = new StringBuilder();
                                                        sb14.append(str4);
                                                        sb14.append(".secure");
                                                        boolean z15 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb14.toString(), str6, str5, capabilitiesForType, z15, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                }
                                            }
                                        } else if (zB2) {
                                            zB2 = true;
                                            i4 = zzel.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (b(mediaCodecInfoZzb, str6)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zB3 = b(mediaCodecInfoZzb, str6);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb15 = new StringBuilder();
                                                    sb15.append(str4);
                                                    sb15.append(".secure");
                                                    boolean z16 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb15.toString(), str6, str5, capabilitiesForType, z16, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            } else {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb16 = new StringBuilder();
                                                    sb16.append(str4);
                                                    sb16.append(".secure");
                                                    boolean z17 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb16.toString(), str6, str5, capabilitiesForType, z17, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            }
                                        }
                                    }
                                    i2 = i6;
                                    i3 = iZza;
                                } else {
                                    i2 = i6;
                                    i3 = iZza;
                                }
                            }
                        } else if (i7 > 19) {
                            supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                            length = supportedTypes.length;
                            i = 0;
                            while (true) {
                                if (i >= length) {
                                    if (!str6.equals("video/dolby-vision")) {
                                        if (!str6.equals("audio/alac")) {
                                            if (!str6.equals("audio/flac")) {
                                                if (!str6.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str6.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str6.equals("audio/flac")) {
                                            if (!str6.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str6.equals("audio/ac3")) {
                                            str = null;
                                            break;
                                        }
                                        str = null;
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i];
                                if (str.equalsIgnoreCase(str6)) {
                                    break;
                                    break;
                                }
                                i++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zB = z97Var.b("tunneled-playback", str, capabilitiesForType);
                                zA = z97Var.a("tunneled-playback", capabilitiesForType);
                                if (y97Var2.c) {
                                    if (!zA) {
                                        zB2 = z97Var.b("secure-playback", str, capabilitiesForType);
                                        zA2 = z97Var.a("secure-playback", capabilitiesForType);
                                        z = y97Var2.b;
                                        if (z) {
                                            if (!zA2) {
                                                i4 = zzel.zza;
                                                if (i4 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (b(mediaCodecInfoZzb, str6)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zB3 = b(mediaCodecInfoZzb, str6);
                                                if (i4 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb17 = new StringBuilder();
                                                        sb17.append(str4);
                                                        sb17.append(".secure");
                                                        boolean z18 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb17.toString(), str6, str5, capabilitiesForType, z18, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                } else {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb18 = new StringBuilder();
                                                        sb18.append(str4);
                                                        sb18.append(".secure");
                                                        boolean z19 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb18.toString(), str6, str5, capabilitiesForType, z19, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                }
                                            }
                                        } else if (zB2) {
                                            zB2 = true;
                                            i4 = zzel.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (b(mediaCodecInfoZzb, str6)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zB3 = b(mediaCodecInfoZzb, str6);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb19 = new StringBuilder();
                                                    sb19.append(str4);
                                                    sb19.append(".secure");
                                                    boolean z110 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb19.toString(), str6, str5, capabilitiesForType, z110, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            } else {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb110 = new StringBuilder();
                                                    sb110.append(str4);
                                                    sb110.append(".secure");
                                                    boolean z111 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb110.toString(), str6, str5, capabilitiesForType, z111, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            }
                                        }
                                    }
                                } else if (zB) {
                                    zB2 = z97Var.b("secure-playback", str, capabilitiesForType);
                                    zA2 = z97Var.a("secure-playback", capabilitiesForType);
                                    z = y97Var2.b;
                                    if (z) {
                                        if (!zA2) {
                                            i4 = zzel.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (b(mediaCodecInfoZzb, str6)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zB3 = b(mediaCodecInfoZzb, str6);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb111 = new StringBuilder();
                                                    sb111.append(str4);
                                                    sb111.append(".secure");
                                                    boolean z112 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb111.toString(), str6, str5, capabilitiesForType, z112, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            } else {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb112 = new StringBuilder();
                                                    sb112.append(str4);
                                                    sb112.append(".secure");
                                                    boolean z113 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb112.toString(), str6, str5, capabilitiesForType, z113, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            }
                                        }
                                    } else if (zB2) {
                                        zB2 = true;
                                        i4 = zzel.zza;
                                        if (i4 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (b(mediaCodecInfoZzb, str6)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zB3 = b(mediaCodecInfoZzb, str6);
                                        if (i4 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            str4 = name;
                                            i2 = i6;
                                            i5 = iZza;
                                            str5 = str;
                                            if (!zZze) {
                                                StringBuilder sb113 = new StringBuilder();
                                                sb113.append(str4);
                                                sb113.append(".secure");
                                                boolean z114 = zIsHardwareAccelerated;
                                                str3 = str4;
                                                i3 = i5;
                                                str2 = str5;
                                                arrayList.add(zzql.zzc(sb113.toString(), str6, str5, capabilitiesForType, z114, zB3, zIsVendor, false, true));
                                                return arrayList;
                                            }
                                            i3 = i5;
                                        } else {
                                            str4 = name;
                                            i2 = i6;
                                            i5 = iZza;
                                            str5 = str;
                                            if (!zZze) {
                                                StringBuilder sb114 = new StringBuilder();
                                                sb114.append(str4);
                                                sb114.append(".secure");
                                                boolean z115 = zIsHardwareAccelerated;
                                                str3 = str4;
                                                i3 = i5;
                                                str2 = str5;
                                                arrayList.add(zzql.zzc(sb114.toString(), str6, str5, capabilitiesForType, z115, zB3, zIsVendor, false, true));
                                                return arrayList;
                                            }
                                            i3 = i5;
                                        }
                                    }
                                }
                                i2 = i6;
                                i3 = iZza;
                            } else {
                                i2 = i6;
                                i3 = iZza;
                            }
                        } else {
                            supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                            length = supportedTypes.length;
                            i = 0;
                            while (true) {
                                if (i >= length) {
                                    if (!str6.equals("video/dolby-vision")) {
                                        if (!str6.equals("audio/alac")) {
                                            if (!str6.equals("audio/flac")) {
                                                if (!str6.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str6.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str6.equals("audio/flac")) {
                                            if (!str6.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str6.equals("audio/ac3")) {
                                            str = null;
                                            break;
                                        }
                                        str = null;
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i];
                                if (str.equalsIgnoreCase(str6)) {
                                    break;
                                    break;
                                }
                                i++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zB = z97Var.b("tunneled-playback", str, capabilitiesForType);
                                zA = z97Var.a("tunneled-playback", capabilitiesForType);
                                if (y97Var2.c) {
                                    if (!zA) {
                                        zB2 = z97Var.b("secure-playback", str, capabilitiesForType);
                                        zA2 = z97Var.a("secure-playback", capabilitiesForType);
                                        z = y97Var2.b;
                                        if (z) {
                                            if (!zA2) {
                                                i4 = zzel.zza;
                                                if (i4 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (b(mediaCodecInfoZzb, str6)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zB3 = b(mediaCodecInfoZzb, str6);
                                                if (i4 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb115 = new StringBuilder();
                                                        sb115.append(str4);
                                                        sb115.append(".secure");
                                                        boolean z116 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb115.toString(), str6, str5, capabilitiesForType, z116, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                } else {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb116 = new StringBuilder();
                                                        sb116.append(str4);
                                                        sb116.append(".secure");
                                                        boolean z117 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb116.toString(), str6, str5, capabilitiesForType, z117, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                }
                                            }
                                        } else if (zB2) {
                                            zB2 = true;
                                            i4 = zzel.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (b(mediaCodecInfoZzb, str6)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zB3 = b(mediaCodecInfoZzb, str6);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb117 = new StringBuilder();
                                                    sb117.append(str4);
                                                    sb117.append(".secure");
                                                    boolean z118 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb117.toString(), str6, str5, capabilitiesForType, z118, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            } else {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb118 = new StringBuilder();
                                                    sb118.append(str4);
                                                    sb118.append(".secure");
                                                    boolean z119 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb118.toString(), str6, str5, capabilitiesForType, z119, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            }
                                        }
                                    }
                                } else if (zB) {
                                    zB2 = z97Var.b("secure-playback", str, capabilitiesForType);
                                    zA2 = z97Var.a("secure-playback", capabilitiesForType);
                                    z = y97Var2.b;
                                    if (z) {
                                        if (!zA2) {
                                            i4 = zzel.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (b(mediaCodecInfoZzb, str6)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zB3 = b(mediaCodecInfoZzb, str6);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb119 = new StringBuilder();
                                                    sb119.append(str4);
                                                    sb119.append(".secure");
                                                    boolean z1110 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb119.toString(), str6, str5, capabilitiesForType, z1110, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            } else {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb1110 = new StringBuilder();
                                                    sb1110.append(str4);
                                                    sb1110.append(".secure");
                                                    boolean z1111 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb1110.toString(), str6, str5, capabilitiesForType, z1111, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            }
                                        }
                                    } else if (zB2) {
                                        zB2 = true;
                                        i4 = zzel.zza;
                                        if (i4 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (b(mediaCodecInfoZzb, str6)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zB3 = b(mediaCodecInfoZzb, str6);
                                        if (i4 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            str4 = name;
                                            i2 = i6;
                                            i5 = iZza;
                                            str5 = str;
                                            if (!zZze) {
                                                StringBuilder sb1111 = new StringBuilder();
                                                sb1111.append(str4);
                                                sb1111.append(".secure");
                                                boolean z1112 = zIsHardwareAccelerated;
                                                str3 = str4;
                                                i3 = i5;
                                                str2 = str5;
                                                arrayList.add(zzql.zzc(sb1111.toString(), str6, str5, capabilitiesForType, z1112, zB3, zIsVendor, false, true));
                                                return arrayList;
                                            }
                                            i3 = i5;
                                        } else {
                                            str4 = name;
                                            i2 = i6;
                                            i5 = iZza;
                                            str5 = str;
                                            if (!zZze) {
                                                StringBuilder sb1112 = new StringBuilder();
                                                sb1112.append(str4);
                                                sb1112.append(".secure");
                                                boolean z1113 = zIsHardwareAccelerated;
                                                str3 = str4;
                                                i3 = i5;
                                                str2 = str5;
                                                arrayList.add(zzql.zzc(sb1112.toString(), str6, str5, capabilitiesForType, z1113, zB3, zIsVendor, false, true));
                                                return arrayList;
                                            }
                                            i3 = i5;
                                        }
                                    }
                                }
                                i2 = i6;
                                i3 = iZza;
                            } else {
                                i2 = i6;
                                i3 = iZza;
                            }
                        }
                    } else if (i7 > 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(zzel.zzc)) {
                        String str8 = zzel.zzb;
                        if (str8.startsWith("d2") || str8.startsWith("serrano") || str8.startsWith("jflte") || str8.startsWith("santos") || str8.startsWith("t0")) {
                            i2 = i6;
                            i3 = iZza;
                        } else if (i7 > 19) {
                            supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                            length = supportedTypes.length;
                            i = 0;
                            while (true) {
                                if (i >= length) {
                                    if (!str6.equals("video/dolby-vision")) {
                                        if (!str6.equals("audio/alac")) {
                                            if (!str6.equals("audio/flac")) {
                                                if (!str6.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str6.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str6.equals("audio/flac")) {
                                            if (!str6.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str6.equals("audio/ac3")) {
                                            str = null;
                                            break;
                                        }
                                        str = null;
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i];
                                if (str.equalsIgnoreCase(str6)) {
                                    break;
                                    break;
                                }
                                i++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zB = z97Var.b("tunneled-playback", str, capabilitiesForType);
                                zA = z97Var.a("tunneled-playback", capabilitiesForType);
                                if (y97Var2.c) {
                                    if (!zA) {
                                        zB2 = z97Var.b("secure-playback", str, capabilitiesForType);
                                        zA2 = z97Var.a("secure-playback", capabilitiesForType);
                                        z = y97Var2.b;
                                        if (z) {
                                            if (!zA2) {
                                                i4 = zzel.zza;
                                                if (i4 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (b(mediaCodecInfoZzb, str6)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zB3 = b(mediaCodecInfoZzb, str6);
                                                if (i4 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb1113 = new StringBuilder();
                                                        sb1113.append(str4);
                                                        sb1113.append(".secure");
                                                        boolean z1114 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb1113.toString(), str6, str5, capabilitiesForType, z1114, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                } else {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb1114 = new StringBuilder();
                                                        sb1114.append(str4);
                                                        sb1114.append(".secure");
                                                        boolean z1115 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb1114.toString(), str6, str5, capabilitiesForType, z1115, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                }
                                            }
                                        } else if (zB2) {
                                            zB2 = true;
                                            i4 = zzel.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (b(mediaCodecInfoZzb, str6)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zB3 = b(mediaCodecInfoZzb, str6);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb1115 = new StringBuilder();
                                                    sb1115.append(str4);
                                                    sb1115.append(".secure");
                                                    boolean z1116 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb1115.toString(), str6, str5, capabilitiesForType, z1116, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            } else {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb1116 = new StringBuilder();
                                                    sb1116.append(str4);
                                                    sb1116.append(".secure");
                                                    boolean z1117 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb1116.toString(), str6, str5, capabilitiesForType, z1117, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            }
                                        }
                                    }
                                } else if (zB) {
                                    zB2 = z97Var.b("secure-playback", str, capabilitiesForType);
                                    zA2 = z97Var.a("secure-playback", capabilitiesForType);
                                    z = y97Var2.b;
                                    if (z) {
                                        if (!zA2) {
                                            i4 = zzel.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (b(mediaCodecInfoZzb, str6)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zB3 = b(mediaCodecInfoZzb, str6);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb1117 = new StringBuilder();
                                                    sb1117.append(str4);
                                                    sb1117.append(".secure");
                                                    boolean z1118 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb1117.toString(), str6, str5, capabilitiesForType, z1118, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            } else {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb1118 = new StringBuilder();
                                                    sb1118.append(str4);
                                                    sb1118.append(".secure");
                                                    boolean z1119 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb1118.toString(), str6, str5, capabilitiesForType, z1119, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            }
                                        }
                                    } else if (zB2) {
                                        zB2 = true;
                                        i4 = zzel.zza;
                                        if (i4 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (b(mediaCodecInfoZzb, str6)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zB3 = b(mediaCodecInfoZzb, str6);
                                        if (i4 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            str4 = name;
                                            i2 = i6;
                                            i5 = iZza;
                                            str5 = str;
                                            if (!zZze) {
                                                StringBuilder sb1119 = new StringBuilder();
                                                sb1119.append(str4);
                                                sb1119.append(".secure");
                                                boolean z11110 = zIsHardwareAccelerated;
                                                str3 = str4;
                                                i3 = i5;
                                                str2 = str5;
                                                arrayList.add(zzql.zzc(sb1119.toString(), str6, str5, capabilitiesForType, z11110, zB3, zIsVendor, false, true));
                                                return arrayList;
                                            }
                                            i3 = i5;
                                        } else {
                                            str4 = name;
                                            i2 = i6;
                                            i5 = iZza;
                                            str5 = str;
                                            if (!zZze) {
                                                StringBuilder sb11110 = new StringBuilder();
                                                sb11110.append(str4);
                                                sb11110.append(".secure");
                                                boolean z11111 = zIsHardwareAccelerated;
                                                str3 = str4;
                                                i3 = i5;
                                                str2 = str5;
                                                arrayList.add(zzql.zzc(sb11110.toString(), str6, str5, capabilitiesForType, z11111, zB3, zIsVendor, false, true));
                                                return arrayList;
                                            }
                                            i3 = i5;
                                        }
                                    }
                                }
                                i2 = i6;
                                i3 = iZza;
                            } else {
                                i2 = i6;
                                i3 = iZza;
                            }
                        } else {
                            supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                            length = supportedTypes.length;
                            i = 0;
                            while (true) {
                                if (i >= length) {
                                    if (!str6.equals("video/dolby-vision")) {
                                        if (!str6.equals("audio/alac")) {
                                            if (!str6.equals("audio/flac")) {
                                                if (!str6.equals("audio/ac3")) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str6.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str6.equals("audio/flac")) {
                                            if (!str6.equals("audio/ac3")) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!str6.equals("audio/ac3")) {
                                            str = null;
                                            break;
                                        }
                                        str = null;
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i];
                                if (str.equalsIgnoreCase(str6)) {
                                    break;
                                    break;
                                }
                                i++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zB = z97Var.b("tunneled-playback", str, capabilitiesForType);
                                zA = z97Var.a("tunneled-playback", capabilitiesForType);
                                if (y97Var2.c) {
                                    if (!zA) {
                                        zB2 = z97Var.b("secure-playback", str, capabilitiesForType);
                                        zA2 = z97Var.a("secure-playback", capabilitiesForType);
                                        z = y97Var2.b;
                                        if (z) {
                                            if (!zA2) {
                                                i4 = zzel.zza;
                                                if (i4 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (b(mediaCodecInfoZzb, str6)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zB3 = b(mediaCodecInfoZzb, str6);
                                                if (i4 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb11111 = new StringBuilder();
                                                        sb11111.append(str4);
                                                        sb11111.append(".secure");
                                                        boolean z11112 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb11111.toString(), str6, str5, capabilitiesForType, z11112, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                } else {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze) {
                                                        StringBuilder sb11112 = new StringBuilder();
                                                        sb11112.append(str4);
                                                        sb11112.append(".secure");
                                                        boolean z11113 = zIsHardwareAccelerated;
                                                        str3 = str4;
                                                        i3 = i5;
                                                        str2 = str5;
                                                        arrayList.add(zzql.zzc(sb11112.toString(), str6, str5, capabilitiesForType, z11113, zB3, zIsVendor, false, true));
                                                        return arrayList;
                                                    }
                                                    i3 = i5;
                                                }
                                            }
                                        } else if (zB2) {
                                            zB2 = true;
                                            i4 = zzel.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (b(mediaCodecInfoZzb, str6)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zB3 = b(mediaCodecInfoZzb, str6);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb11113 = new StringBuilder();
                                                    sb11113.append(str4);
                                                    sb11113.append(".secure");
                                                    boolean z11114 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb11113.toString(), str6, str5, capabilitiesForType, z11114, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            } else {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb11114 = new StringBuilder();
                                                    sb11114.append(str4);
                                                    sb11114.append(".secure");
                                                    boolean z11115 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb11114.toString(), str6, str5, capabilitiesForType, z11115, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            }
                                        }
                                    }
                                } else if (zB) {
                                    zB2 = z97Var.b("secure-playback", str, capabilitiesForType);
                                    zA2 = z97Var.a("secure-playback", capabilitiesForType);
                                    z = y97Var2.b;
                                    if (z) {
                                        if (!zA2) {
                                            i4 = zzel.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (b(mediaCodecInfoZzb, str6)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zB3 = b(mediaCodecInfoZzb, str6);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb11115 = new StringBuilder();
                                                    sb11115.append(str4);
                                                    sb11115.append(".secure");
                                                    boolean z11116 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb11115.toString(), str6, str5, capabilitiesForType, z11116, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            } else {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb11116 = new StringBuilder();
                                                    sb11116.append(str4);
                                                    sb11116.append(".secure");
                                                    boolean z11117 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb11116.toString(), str6, str5, capabilitiesForType, z11117, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            }
                                        }
                                    } else if (zB2) {
                                        zB2 = true;
                                        i4 = zzel.zza;
                                        if (i4 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (b(mediaCodecInfoZzb, str6)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zB3 = b(mediaCodecInfoZzb, str6);
                                        if (i4 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            str4 = name;
                                            i2 = i6;
                                            i5 = iZza;
                                            str5 = str;
                                            if (!zZze) {
                                                StringBuilder sb11117 = new StringBuilder();
                                                sb11117.append(str4);
                                                sb11117.append(".secure");
                                                boolean z11118 = zIsHardwareAccelerated;
                                                str3 = str4;
                                                i3 = i5;
                                                str2 = str5;
                                                arrayList.add(zzql.zzc(sb11117.toString(), str6, str5, capabilitiesForType, z11118, zB3, zIsVendor, false, true));
                                                return arrayList;
                                            }
                                            i3 = i5;
                                        } else {
                                            str4 = name;
                                            i2 = i6;
                                            i5 = iZza;
                                            str5 = str;
                                            if (!zZze) {
                                                StringBuilder sb11118 = new StringBuilder();
                                                sb11118.append(str4);
                                                sb11118.append(".secure");
                                                boolean z11119 = zIsHardwareAccelerated;
                                                str3 = str4;
                                                i3 = i5;
                                                str2 = str5;
                                                arrayList.add(zzql.zzc(sb11118.toString(), str6, str5, capabilitiesForType, z11119, zB3, zIsVendor, false, true));
                                                return arrayList;
                                            }
                                            i3 = i5;
                                        }
                                    }
                                }
                                i2 = i6;
                                i3 = iZza;
                            } else {
                                i2 = i6;
                                i3 = iZza;
                            }
                        }
                    } else if ((i7 > 19 && zzel.zzb.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(name)) || (i7 <= 23 && "audio/eac3-joc".equals(str6) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name))) {
                        i2 = i6;
                        i3 = iZza;
                    } else {
                        supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        length = supportedTypes.length;
                        i = 0;
                        while (true) {
                            if (i >= length) {
                                if (!str6.equals("video/dolby-vision")) {
                                    if (!str6.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                        str = "audio/x-lg-alac";
                                        break;
                                    }
                                    if (!str6.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                        str = "audio/x-lg-flac";
                                        break;
                                    }
                                    if (!str6.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                        str = "audio/lg-ac3";
                                        break;
                                    }
                                    str = null;
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if ("OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/dv_hevc";
                                    break;
                                }
                                str = "video/hevcdv";
                                break;
                            }
                            str = supportedTypes[i];
                            if (str.equalsIgnoreCase(str6)) {
                                break;
                            }
                            i++;
                        }
                        if (str != null) {
                            try {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zB = z97Var.b("tunneled-playback", str, capabilitiesForType);
                                zA = z97Var.a("tunneled-playback", capabilitiesForType);
                                if (y97Var2.c) {
                                    if (!zA) {
                                        zB2 = z97Var.b("secure-playback", str, capabilitiesForType);
                                        zA2 = z97Var.a("secure-playback", capabilitiesForType);
                                        z = y97Var2.b;
                                        if (z) {
                                            if (!zA2) {
                                                i4 = zzel.zza;
                                                if (i4 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (b(mediaCodecInfoZzb, str6)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zB3 = b(mediaCodecInfoZzb, str6);
                                                if (i4 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = true;
                                                    }
                                                }
                                                if ((zZze || z != zB2) && (zZze || z)) {
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    str5 = str;
                                                    if (!zZze && zB2) {
                                                        try {
                                                            StringBuilder sb11119 = new StringBuilder();
                                                            try {
                                                                sb11119.append(str4);
                                                                sb11119.append(".secure");
                                                                boolean z111110 = zIsHardwareAccelerated;
                                                                str3 = str4;
                                                                i3 = i5;
                                                                str2 = str5;
                                                                try {
                                                                    arrayList.add(zzql.zzc(sb11119.toString(), str6, str5, capabilitiesForType, z111110, zB3, zIsVendor, false, true));
                                                                    return arrayList;
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    if (zzel.zza <= 23) {
                                                                    }
                                                                    Log.e("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                                    throw e;
                                                                }
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                i3 = i5;
                                                                str3 = str4;
                                                                str2 = str5;
                                                            }
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            i3 = i5;
                                                            str2 = str5;
                                                            str3 = str4;
                                                            if (zzel.zza <= 23 || arrayList.isEmpty()) {
                                                                Log.e("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                                throw e;
                                                            }
                                                            Log.e("MediaCodecUtil", "Skipping codec " + str3 + " (failed to query capabilities)");
                                                            i6 = i2 + 1;
                                                            y97Var2 = y97Var;
                                                        }
                                                    }
                                                    i3 = i5;
                                                } else {
                                                    String str9 = str;
                                                    str4 = name;
                                                    i2 = i6;
                                                    i5 = iZza;
                                                    try {
                                                        arrayList.add(zzql.zzc(name, str6, str, capabilitiesForType, zIsHardwareAccelerated, zB3, zIsVendor, false, false));
                                                        i3 = i5;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        i3 = i5;
                                                        str2 = str9;
                                                        str3 = str4;
                                                        if (zzel.zza <= 23) {
                                                        }
                                                        Log.e("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                        throw e;
                                                    }
                                                }
                                            }
                                        } else if (zB2) {
                                            zB2 = true;
                                            i4 = zzel.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (b(mediaCodecInfoZzb, str6)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zB3 = b(mediaCodecInfoZzb, str6);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb111110 = new StringBuilder();
                                                    sb111110.append(str4);
                                                    sb111110.append(".secure");
                                                    boolean z111111 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb111110.toString(), str6, str5, capabilitiesForType, z111111, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            } else {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb111111 = new StringBuilder();
                                                    sb111111.append(str4);
                                                    sb111111.append(".secure");
                                                    boolean z111112 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb111111.toString(), str6, str5, capabilitiesForType, z111112, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            }
                                        }
                                    }
                                } else if (zB) {
                                    zB2 = z97Var.b("secure-playback", str, capabilitiesForType);
                                    zA2 = z97Var.a("secure-playback", capabilitiesForType);
                                    z = y97Var2.b;
                                    if (z) {
                                        if (!zA2) {
                                            i4 = zzel.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (b(mediaCodecInfoZzb, str6)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zB3 = b(mediaCodecInfoZzb, str6);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb111112 = new StringBuilder();
                                                    sb111112.append(str4);
                                                    sb111112.append(".secure");
                                                    boolean z111113 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb111112.toString(), str6, str5, capabilitiesForType, z111113, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            } else {
                                                str4 = name;
                                                i2 = i6;
                                                i5 = iZza;
                                                str5 = str;
                                                if (!zZze) {
                                                    StringBuilder sb111113 = new StringBuilder();
                                                    sb111113.append(str4);
                                                    sb111113.append(".secure");
                                                    boolean z111114 = zIsHardwareAccelerated;
                                                    str3 = str4;
                                                    i3 = i5;
                                                    str2 = str5;
                                                    arrayList.add(zzql.zzc(sb111113.toString(), str6, str5, capabilitiesForType, z111114, zB3, zIsVendor, false, true));
                                                    return arrayList;
                                                }
                                                i3 = i5;
                                            }
                                        }
                                    } else if (zB2) {
                                        zB2 = true;
                                        i4 = zzel.zza;
                                        if (i4 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (b(mediaCodecInfoZzb, str6)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zB3 = b(mediaCodecInfoZzb, str6);
                                        if (i4 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzfrm.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            str4 = name;
                                            i2 = i6;
                                            i5 = iZza;
                                            str5 = str;
                                            if (!zZze) {
                                                StringBuilder sb111114 = new StringBuilder();
                                                sb111114.append(str4);
                                                sb111114.append(".secure");
                                                boolean z111115 = zIsHardwareAccelerated;
                                                str3 = str4;
                                                i3 = i5;
                                                str2 = str5;
                                                arrayList.add(zzql.zzc(sb111114.toString(), str6, str5, capabilitiesForType, z111115, zB3, zIsVendor, false, true));
                                                return arrayList;
                                            }
                                            i3 = i5;
                                        } else {
                                            str4 = name;
                                            i2 = i6;
                                            i5 = iZza;
                                            str5 = str;
                                            if (!zZze) {
                                                StringBuilder sb111115 = new StringBuilder();
                                                sb111115.append(str4);
                                                sb111115.append(".secure");
                                                boolean z111116 = zIsHardwareAccelerated;
                                                str3 = str4;
                                                i3 = i5;
                                                str2 = str5;
                                                arrayList.add(zzql.zzc(sb111115.toString(), str6, str5, capabilitiesForType, z111116, zB3, zIsVendor, false, true));
                                                return arrayList;
                                            }
                                            i3 = i5;
                                        }
                                    }
                                }
                                i2 = i6;
                                i3 = iZza;
                            } catch (Exception e5) {
                                e = e5;
                                str2 = str;
                                str3 = name;
                                i2 = i6;
                                i3 = iZza;
                            }
                        } else {
                            i2 = i6;
                            i3 = iZza;
                        }
                    }
                } else {
                    i2 = i6;
                    i3 = iZza;
                }
                i6 = i2 + 1;
                y97Var2 = y97Var;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new zzqx(e6);
        }
    }

    public static boolean b(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzel.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzbt.zzg(str)) {
            return true;
        }
        String strZza = zzfrm.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }

    public static int zza() {
        int i;
        int iMax = c;
        if (iMax == -1) {
            zzql zzqlVarZzc = zzc("video/avc", false, false);
            if (zzqlVarZzc != null) {
                int iMax2 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzqlVarZzc.zzg()) {
                    int i2 = codecProfileLevel.level;
                    if (i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    iMax2 = Math.max(i, iMax2);
                }
                iMax = Math.max(iMax2, zzel.zza >= 21 ? 345600 : 172800);
            } else {
                iMax = 0;
            }
            c = iMax;
        }
        return iMax;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:141:0x024c  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cf A[Catch: NumberFormatException -> 0x02de, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x02de, blocks: (B:149:0x026a, B:151:0x027c, B:162:0x0298, B:178:0x02cf), top: B:490:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:331:0x0540  */
    /* JADX WARN: Code duplicated, block: B:360:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x010b  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v201 int, still in use, count: 1, list:
  (r1v201 int) from 0x012a: SWITCH (r1v201 int)
 case 1567: goto B:108:0x01d6
 case 1568: goto B:105:0x01c7
 case 1569: goto B:102:0x01b8
 case 1570: goto B:99:0x01a9
 default: goto B:111:0x01e3 A[RegionRef:SW:70] (LINE:299)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Pair zzb(zzaf zzafVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Integer numValueOf;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Integer numValueOf2;
        Integer numValueOf3;
        String str = zzafVar.zzj;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        int i14 = 8;
        int i15 = 2;
        if ("video/dolby-vision".equals(zzafVar.zzm)) {
            String str2 = zzafVar.zzj;
            if (strArrSplit.length < 3) {
                Log.w("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str2)));
            } else {
                Matcher matcher = a.matcher(strArrSplit[1]);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    if (strGroup != null) {
                        switch (strGroup) {
                            case "00":
                                numValueOf2 = 1;
                                break;
                            case "01":
                                numValueOf2 = 2;
                                break;
                            case "02":
                                numValueOf2 = 4;
                                break;
                            case "03":
                                numValueOf2 = 8;
                                break;
                            case "04":
                                numValueOf2 = 16;
                                break;
                            case "05":
                                numValueOf2 = 32;
                                break;
                            case "06":
                                numValueOf2 = 64;
                                break;
                            case "07":
                                numValueOf2 = 128;
                                break;
                            case "08":
                                numValueOf2 = 256;
                                break;
                            case "09":
                                numValueOf2 = Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH);
                                break;
                            default:
                                numValueOf2 = null;
                                break;
                        }
                    } else {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 == null) {
                        Log.w("MediaCodecUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(strGroup)));
                    } else {
                        String str3 = strArrSplit[2];
                        if (str3 != null) {
                            switch (str3) {
                                case "01":
                                    numValueOf3 = 1;
                                    break;
                                case "02":
                                    numValueOf3 = 2;
                                    break;
                                case "03":
                                    numValueOf3 = 4;
                                    break;
                                case "04":
                                    numValueOf3 = 8;
                                    break;
                                case "05":
                                    numValueOf3 = 16;
                                    break;
                                case "06":
                                    numValueOf3 = 32;
                                    break;
                                case "07":
                                    numValueOf3 = 64;
                                    break;
                                case "08":
                                    numValueOf3 = 128;
                                    break;
                                case "09":
                                    numValueOf3 = 256;
                                    break;
                                default:
                                    switch (str3) {
                                        case 1567:
                                            if (!str3.equals("10")) {
                                                numValueOf3 = null;
                                            } else {
                                                numValueOf3 = Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH);
                                            }
                                            break;
                                        case 1568:
                                            if (!str3.equals("11")) {
                                                numValueOf3 = null;
                                            } else {
                                                numValueOf3 = 1024;
                                            }
                                            break;
                                        case 1569:
                                            if (!str3.equals("12")) {
                                                numValueOf3 = null;
                                            } else {
                                                numValueOf3 = 2048;
                                            }
                                            break;
                                        case 1570:
                                            if (!str3.equals("13")) {
                                                numValueOf3 = null;
                                            } else {
                                                numValueOf3 = 4096;
                                            }
                                            break;
                                        default:
                                            numValueOf3 = null;
                                            break;
                                    }
                            }
                        } else {
                            numValueOf3 = null;
                        }
                        if (numValueOf3 != null) {
                            return new Pair(numValueOf2, numValueOf3);
                        }
                        Log.w("MediaCodecUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str3)));
                    }
                } else {
                    Log.w("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: ".concat(String.valueOf(str2)));
                }
            }
            return null;
        }
        switch (strArrSplit[0]) {
            case "avc1":
            case "avc2":
                String str4 = zzafVar.zzj;
                int length = strArrSplit.length;
                if (length < 2) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str4)));
                } else {
                    try {
                        if (strArrSplit[1].length() == 6) {
                            i = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i2 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        } else if (length >= 3) {
                            i = Integer.parseInt(strArrSplit[1]);
                            i2 = Integer.parseInt(strArrSplit[2]);
                        } else {
                            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str4);
                        }
                        if (i == 66) {
                            i3 = -1;
                            i15 = 1;
                        } else if (i == 77) {
                            i3 = -1;
                        } else if (i == 88) {
                            i3 = -1;
                            i15 = 4;
                        } else if (i == 100) {
                            i3 = -1;
                            i15 = 8;
                        } else if (i == 110) {
                            i3 = -1;
                            i15 = 16;
                        } else if (i == 122) {
                            i3 = -1;
                            i15 = 32;
                        } else if (i != 244) {
                            i3 = -1;
                            i15 = -1;
                        } else {
                            i3 = -1;
                            i15 = 64;
                        }
                        if (i15 == i3) {
                            bj0.b("Unknown AVC profile: ", i, "MediaCodecUtil");
                        } else {
                            switch (i2) {
                                case 10:
                                    i4 = 1;
                                    break;
                                case 11:
                                    i4 = 4;
                                    break;
                                case 12:
                                    i4 = 8;
                                    break;
                                case 13:
                                    i4 = 16;
                                    break;
                                default:
                                    switch (i2) {
                                        case 20:
                                            i4 = 32;
                                            break;
                                        case 21:
                                            i4 = 64;
                                            break;
                                        case 22:
                                            i4 = 128;
                                            break;
                                        default:
                                            switch (i2) {
                                                case 30:
                                                    i4 = 256;
                                                    break;
                                                case 31:
                                                    i4 = AdRequest.MAX_CONTENT_URL_LENGTH;
                                                    break;
                                                case 32:
                                                    i4 = 1024;
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case 40:
                                                            i4 = 2048;
                                                            break;
                                                        case 41:
                                                            i4 = 4096;
                                                            break;
                                                        case 42:
                                                            i4 = 8192;
                                                            break;
                                                        default:
                                                            switch (i2) {
                                                                case 50:
                                                                    i4 = 16384;
                                                                    break;
                                                                case 51:
                                                                    i4 = 32768;
                                                                    break;
                                                                case 52:
                                                                    i4 = 65536;
                                                                    break;
                                                                default:
                                                                    i4 = -1;
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            if (i4 != -1) {
                                return new Pair(Integer.valueOf(i15), Integer.valueOf(i4));
                            }
                            bj0.b("Unknown AVC level: ", i2, "MediaCodecUtil");
                        }
                    } catch (NumberFormatException unused) {
                        Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str4)));
                    }
                }
                return null;
            case "vp09":
                String str5 = zzafVar.zzj;
                if (strArrSplit.length < 3) {
                    Log.w("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str5)));
                } else {
                    try {
                        int i16 = Integer.parseInt(strArrSplit[1]);
                        int i17 = Integer.parseInt(strArrSplit[2]);
                        if (i16 == 0) {
                            i5 = 1;
                        } else if (i16 == 1) {
                            i5 = 2;
                        } else if (i16 != 2) {
                            i5 = i16 != 3 ? -1 : 8;
                        } else {
                            i5 = 4;
                        }
                        if (i5 == -1) {
                            bj0.b("Unknown VP9 profile: ", i16, "MediaCodecUtil");
                        } else {
                            if (i17 == 10) {
                                i6 = -1;
                                i14 = 1;
                            } else if (i17 == 11) {
                                i6 = -1;
                                i14 = 2;
                            } else if (i17 == 20) {
                                i6 = -1;
                                i14 = 4;
                            } else if (i17 == 21) {
                                i6 = -1;
                            } else if (i17 == 30) {
                                i6 = -1;
                                i14 = 16;
                            } else if (i17 == 31) {
                                i6 = -1;
                                i14 = 32;
                            } else if (i17 == 40) {
                                i6 = -1;
                                i14 = 64;
                            } else if (i17 == 41) {
                                i6 = -1;
                                i14 = 128;
                            } else if (i17 == 50) {
                                i6 = -1;
                                i14 = 256;
                            } else if (i17 != 51) {
                                i6 = -1;
                                switch (i17) {
                                    case 60:
                                        i14 = 2048;
                                        break;
                                    case 61:
                                        i14 = 4096;
                                        break;
                                    case 62:
                                        i14 = 8192;
                                        break;
                                    default:
                                        i14 = -1;
                                        break;
                                }
                            } else {
                                i6 = -1;
                                i14 = AdRequest.MAX_CONTENT_URL_LENGTH;
                            }
                            if (i14 != i6) {
                                return new Pair(Integer.valueOf(i5), Integer.valueOf(i14));
                            }
                            bj0.b("Unknown VP9 level: ", i17, "MediaCodecUtil");
                        }
                    } catch (NumberFormatException unused2) {
                        Log.w("MediaCodecUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str5)));
                    }
                }
                return null;
            case "hev1":
            case "hvc1":
                String str6 = zzafVar.zzj;
                if (strArrSplit.length < 4) {
                    Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str6)));
                } else {
                    Matcher matcher2 = a.matcher(strArrSplit[1]);
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        if ("1".equals(strGroup2)) {
                            i7 = 1;
                        } else if ("2".equals(strGroup2)) {
                            i7 = 2;
                        } else {
                            Log.w("MediaCodecUtil", "Unknown HEVC profile string: ".concat(String.valueOf(strGroup2)));
                        }
                        String str7 = strArrSplit[3];
                        if (str7 != null) {
                            switch (str7) {
                                case "L30":
                                    numValueOf = 1;
                                    break;
                                case "L60":
                                    numValueOf = 4;
                                    break;
                                case "L63":
                                    numValueOf = 16;
                                    break;
                                case "L90":
                                    numValueOf = 64;
                                    break;
                                case "L93":
                                    numValueOf = 256;
                                    break;
                                case "L120":
                                    numValueOf = 1024;
                                    break;
                                case "L123":
                                    numValueOf = 4096;
                                    break;
                                case "L150":
                                    numValueOf = 16384;
                                    break;
                                case "L153":
                                    numValueOf = 65536;
                                    break;
                                case "L156":
                                    numValueOf = 262144;
                                    break;
                                case "L180":
                                    numValueOf = 1048576;
                                    break;
                                case "L183":
                                    numValueOf = 4194304;
                                    break;
                                case "L186":
                                    numValueOf = 16777216;
                                    break;
                                case "H30":
                                    numValueOf = 2;
                                    break;
                                case "H60":
                                    numValueOf = 8;
                                    break;
                                case "H63":
                                    numValueOf = 32;
                                    break;
                                case "H90":
                                    numValueOf = 128;
                                    break;
                                case "H93":
                                    numValueOf = Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH);
                                    break;
                                case "H120":
                                    numValueOf = 2048;
                                    break;
                                case "H123":
                                    numValueOf = 8192;
                                    break;
                                case "H150":
                                    numValueOf = 32768;
                                    break;
                                case "H153":
                                    numValueOf = 131072;
                                    break;
                                case "H156":
                                    numValueOf = 524288;
                                    break;
                                case "H180":
                                    numValueOf = 2097152;
                                    break;
                                case "H183":
                                    numValueOf = 8388608;
                                    break;
                                case "H186":
                                    numValueOf = 33554432;
                                    break;
                                default:
                                    numValueOf = null;
                                    break;
                            }
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            return new Pair(Integer.valueOf(i7), numValueOf);
                        }
                        Log.w("MediaCodecUtil", "Unknown HEVC level string: ".concat(String.valueOf(str7)));
                    } else {
                        Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str6)));
                    }
                }
                return null;
            case "av01":
                String str8 = zzafVar.zzj;
                zzq zzqVar = zzafVar.zzy;
                if (strArrSplit.length < 4) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str8)));
                } else {
                    try {
                        int i18 = Integer.parseInt(strArrSplit[1]);
                        int i19 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                        int i20 = Integer.parseInt(strArrSplit[3]);
                        if (i18 != 0) {
                            bj0.b("Unknown AV1 profile: ", i18, "MediaCodecUtil");
                        } else {
                            if (i20 == 8) {
                                i8 = 1;
                            } else if (i20 != 10) {
                                bj0.b("Unknown AV1 bit depth: ", i20, "MediaCodecUtil");
                            } else {
                                i8 = (zzqVar == null || !(zzqVar.zze != null || (i11 = zzqVar.zzd) == 7 || i11 == 6)) ? 2 : 4096;
                            }
                            switch (i19) {
                                case 0:
                                    i9 = -1;
                                    i10 = 1;
                                    break;
                                case 1:
                                    i9 = -1;
                                    i10 = i15;
                                    break;
                                case 2:
                                    i9 = -1;
                                    i10 = 4;
                                    break;
                                case 3:
                                    i9 = -1;
                                    i10 = 8;
                                    break;
                                case 4:
                                    i9 = -1;
                                    i10 = 16;
                                    break;
                                case 5:
                                    i9 = -1;
                                    i10 = 32;
                                    break;
                                case 6:
                                    i9 = -1;
                                    i10 = 64;
                                    break;
                                case 7:
                                    i9 = -1;
                                    i10 = 128;
                                    break;
                                case 8:
                                    i9 = -1;
                                    i10 = 256;
                                    break;
                                case 9:
                                    i9 = -1;
                                    i10 = AdRequest.MAX_CONTENT_URL_LENGTH;
                                    break;
                                case 10:
                                    i9 = -1;
                                    i10 = 1024;
                                    break;
                                case 11:
                                    i9 = -1;
                                    i10 = 2048;
                                    break;
                                case 12:
                                    i9 = -1;
                                    i10 = 4096;
                                    break;
                                case 13:
                                    i9 = -1;
                                    i10 = 8192;
                                    break;
                                case 14:
                                    i15 = 16384;
                                    i9 = -1;
                                    i10 = i15;
                                    break;
                                case 15:
                                    i15 = 32768;
                                    i9 = -1;
                                    i10 = i15;
                                    break;
                                case 16:
                                    i15 = 65536;
                                    i9 = -1;
                                    i10 = i15;
                                    break;
                                case 17:
                                    i15 = 131072;
                                    i9 = -1;
                                    i10 = i15;
                                    break;
                                case 18:
                                    i15 = 262144;
                                    i9 = -1;
                                    i10 = i15;
                                    break;
                                case 19:
                                    i15 = 524288;
                                    i9 = -1;
                                    i10 = i15;
                                    break;
                                case 20:
                                    i15 = 1048576;
                                    i9 = -1;
                                    i10 = i15;
                                    break;
                                case 21:
                                    i15 = 2097152;
                                    i9 = -1;
                                    i10 = i15;
                                    break;
                                case 22:
                                    i15 = 4194304;
                                    i9 = -1;
                                    i10 = i15;
                                    break;
                                case 23:
                                    i15 = 8388608;
                                    i9 = -1;
                                    i10 = i15;
                                    break;
                                default:
                                    i9 = -1;
                                    i10 = -1;
                                    break;
                            }
                            if (i10 != i9) {
                                return new Pair(Integer.valueOf(i8), Integer.valueOf(i10));
                            }
                            bj0.b("Unknown AV1 level: ", i19, "MediaCodecUtil");
                        }
                    } catch (NumberFormatException unused3) {
                        Log.w("MediaCodecUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str8)));
                    }
                }
                return null;
            case "mp4a":
                String str9 = zzafVar.zzj;
                if (strArrSplit.length != 3) {
                    Log.w("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str9)));
                } else {
                    try {
                        if ("audio/mp4a-latm".equals(zzbt.zzd(Integer.parseInt(strArrSplit[1], 16)))) {
                            int i21 = Integer.parseInt(strArrSplit[2]);
                            if (i21 != 17) {
                                if (i21 == 20) {
                                    i13 = -1;
                                    i12 = 20;
                                } else if (i21 == 23) {
                                    i12 = 23;
                                } else if (i21 == 29) {
                                    i12 = 29;
                                } else if (i21 == 39) {
                                    i12 = 39;
                                } else if (i21 != 42) {
                                    switch (i21) {
                                        case 1:
                                            i13 = -1;
                                            i12 = 1;
                                            break;
                                        case 2:
                                            i13 = -1;
                                            i12 = 2;
                                            break;
                                        case 3:
                                            i13 = -1;
                                            i12 = 3;
                                            break;
                                        case 4:
                                            i13 = -1;
                                            i12 = 4;
                                            break;
                                        case 5:
                                            i13 = -1;
                                            i12 = 5;
                                            break;
                                        case 6:
                                            i13 = -1;
                                            i12 = 6;
                                            break;
                                        default:
                                            i13 = -1;
                                            i12 = -1;
                                            break;
                                    }
                                } else {
                                    i12 = 42;
                                }
                                if (i12 != i13) {
                                    return new Pair(Integer.valueOf(i12), 0);
                                }
                            } else {
                                i12 = 17;
                            }
                            i13 = -1;
                            if (i12 != i13) {
                                return new Pair(Integer.valueOf(i12), 0);
                            }
                        }
                    } catch (NumberFormatException unused4) {
                        Log.w("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str9)));
                    }
                }
                return null;
            default:
                return null;
        }
    }

    public static zzql zzc(String str, boolean z, boolean z2) {
        List listZzf = zzf(str, false, false);
        if (listZzf.isEmpty()) {
            return null;
        }
        return (zzql) listZzf.get(0);
    }

    public static zzql zzd() {
        return zzc("audio/raw", false, false);
    }

    public static String zze(zzaf zzafVar) {
        Pair pairZzb;
        if ("audio/eac3-joc".equals(zzafVar.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzafVar.zzm) || (pairZzb = zzb(zzafVar)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairZzb.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static synchronized List zzf(String str, boolean z, boolean z2) {
        y97 y97Var = new y97(str, z, z2);
        HashMap map = b;
        List list = (List) map.get(y97Var);
        if (list != null) {
            return list;
        }
        int i = zzel.zza;
        ArrayList arrayListA = a(y97Var, i >= 21 ? new ja7(z, z2) : new ia7());
        if (z && arrayListA.isEmpty() && i >= 21 && i <= 23) {
            arrayListA = a(y97Var, new ia7());
            if (!arrayListA.isEmpty()) {
                Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzql) arrayListA.get(0)).zza);
            }
        }
        if ("audio/raw".equals(str)) {
            if (i < 26 && zzel.zzb.equals("R9") && arrayListA.size() == 1 && ((zzql) arrayListA.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListA.add(zzql.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            Collections.sort(arrayListA, new zzqs(new ka7() { // from class: com.google.android.gms.internal.ads.zzqt
                @Override // defpackage.ka7
                public final int zza(Object obj) {
                    Pattern pattern = zzrd.a;
                    String str2 = ((zzql) obj).zza;
                    if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                        return 1;
                    }
                    return (zzel.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                }
            }));
        }
        if (i < 21 && arrayListA.size() > 1) {
            String str2 = ((zzql) arrayListA.get(0)).zza;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayListA, new zzqs(new ka7() { // from class: com.google.android.gms.internal.ads.zzqu
                    @Override // defpackage.ka7
                    public final int zza(Object obj) {
                        Pattern pattern = zzrd.a;
                        return ((zzql) obj).zza.startsWith("OMX.google") ? 1 : 0;
                    }
                }));
            }
        }
        if (i < 32 && arrayListA.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzql) arrayListA.get(0)).zza)) {
            arrayListA.add((zzql) arrayListA.remove(0));
        }
        zzfuv zzfuvVarZzm = zzfuv.zzm(arrayListA);
        map.put(y97Var, zzfuvVarZzm);
        return zzfuvVarZzm;
    }

    public static List zzg(List list, final zzaf zzafVar) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new zzqs(new ka7() { // from class: com.google.android.gms.internal.ads.zzqr
            @Override // defpackage.ka7
            public final int zza(Object obj) {
                zzaf zzafVar2 = zzafVar;
                zzql zzqlVar = (zzql) obj;
                Pattern pattern = zzrd.a;
                try {
                    return !zzqlVar.zzd(zzafVar2) ? 0 : 1;
                } catch (zzqx unused) {
                    return -1;
                }
            }
        }));
        return arrayList;
    }
}
