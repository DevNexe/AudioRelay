package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import dalvik.system.DelegateLastClassLoader;
import defpackage.bb0;
import defpackage.f76;
import defpackage.i76;
import defpackage.j57;
import defpackage.nr5;
import defpackage.oa1;
import defpackage.oa3;
import defpackage.tq2;
import defpackage.y26;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    @GuardedBy("DynamiteModule.class")
    public static Boolean e = null;

    @GuardedBy("DynamiteModule.class")
    public static String f = null;

    @GuardedBy("DynamiteModule.class")
    public static boolean g = false;

    @GuardedBy("DynamiteModule.class")
    public static int h = -1;

    @GuardedBy("DynamiteModule.class")
    public static Boolean i;

    @GuardedBy("DynamiteModule.class")
    public static zzq m;

    @GuardedBy("DynamiteModule.class")
    public static zzr n;
    public final Context a;
    public static final ThreadLocal j = new ThreadLocal();
    public static final nr5 k = new nr5(1);
    public static final com.google.android.gms.dynamite.QnHx l = new com.google.android.gms.dynamite.QnHx();
    public static final CQf b = new CQf();
    public static final F1 c = new F1();
    public static final LPt8Fixed d = new LPt8Fixed();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface QnHx {

        public static class CQf {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$QnHx$QnHx, reason: collision with other inner class name */
        public interface InterfaceC0076QnHx {
            int a(Context context, String str, boolean z);

            int b(Context context, String str);
        }

        CQf a(Context context, String str, InterfaceC0076QnHx interfaceC0076QnHx);
    }

    public DynamiteModule(Context context) {
        oa3.h(context);
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (tq2.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0220 A[Catch: all -> 0x0133, LoadingException -> 0x0246, RemoteException -> 0x0248, TryCatch #7 {RemoteException -> 0x0248, LoadingException -> 0x0246, all -> 0x0133, blocks: (B:28:0x00ba, B:34:0x00c6, B:36:0x00cc, B:37:0x00e7, B:41:0x00ed, B:43:0x00f5, B:45:0x00f9, B:46:0x0107, B:53:0x0117, B:55:0x011d, B:59:0x014b, B:61:0x0153, B:62:0x015a, B:63:0x0161, B:58:0x0136, B:66:0x0164, B:67:0x0165, B:68:0x016c, B:69:0x016d, B:70:0x0174, B:73:0x0177, B:74:0x0178, B:76:0x0197, B:78:0x01aa, B:80:0x01b2, B:87:0x01ef, B:89:0x01f5, B:99:0x0218, B:100:0x021f, B:81:0x01c3, B:82:0x01ca, B:85:0x01ce, B:86:0x01df, B:101:0x0220, B:102:0x0227, B:103:0x0228, B:104:0x022f, B:109:0x023a), top: B:155:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0228 A[Catch: all -> 0x0133, LoadingException -> 0x0246, RemoteException -> 0x0248, TryCatch #7 {RemoteException -> 0x0248, LoadingException -> 0x0246, all -> 0x0133, blocks: (B:28:0x00ba, B:34:0x00c6, B:36:0x00cc, B:37:0x00e7, B:41:0x00ed, B:43:0x00f5, B:45:0x00f9, B:46:0x0107, B:53:0x0117, B:55:0x011d, B:59:0x014b, B:61:0x0153, B:62:0x015a, B:63:0x0161, B:58:0x0136, B:66:0x0164, B:67:0x0165, B:68:0x016c, B:69:0x016d, B:70:0x0174, B:73:0x0177, B:74:0x0178, B:76:0x0197, B:78:0x01aa, B:80:0x01b2, B:87:0x01ef, B:89:0x01f5, B:99:0x0218, B:100:0x021f, B:81:0x01c3, B:82:0x01ca, B:85:0x01ce, B:86:0x01df, B:101:0x0220, B:102:0x0227, B:103:0x0228, B:104:0x022f, B:109:0x023a), top: B:155:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0230 A[Catch: all -> 0x0238, TRY_ENTER, TryCatch #4 {, blocks: (B:29:0x00bb, B:31:0x00c1, B:32:0x00c3, B:105:0x0230, B:106:0x0237), top: B:153:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02be A[Catch: all -> 0x02ff, TryCatch #7 {all -> 0x02ff, blocks: (B:3:0x002d, B:7:0x0076, B:12:0x007e, B:15:0x0084, B:26:0x00b6, B:110:0x023b, B:111:0x0245, B:113:0x0247, B:115:0x0249, B:116:0x0250, B:134:0x02be, B:135:0x02d1, B:118:0x0252, B:120:0x0270, B:122:0x0280, B:132:0x02b6, B:133:0x02bd, B:136:0x02d2, B:137:0x02fe), top: B:154:0x002d, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0084 A[Catch: all -> 0x02ff, TRY_LEAVE, TryCatch #7 {all -> 0x02ff, blocks: (B:3:0x002d, B:7:0x0076, B:12:0x007e, B:15:0x0084, B:26:0x00b6, B:110:0x023b, B:111:0x0245, B:113:0x0247, B:115:0x0249, B:116:0x0250, B:134:0x02be, B:135:0x02d1, B:118:0x0252, B:120:0x0270, B:122:0x0280, B:132:0x02b6, B:133:0x02bd, B:136:0x02d2, B:137:0x02fe), top: B:154:0x002d, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x009e  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1 A[Catch: all -> 0x0238, TryCatch #4 {, blocks: (B:29:0x00bb, B:31:0x00c1, B:32:0x00c3, B:105:0x0230, B:106:0x0237), top: B:153:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6 A[Catch: all -> 0x0133, LoadingException -> 0x0246, RemoteException -> 0x0248, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0248, LoadingException -> 0x0246, all -> 0x0133, blocks: (B:28:0x00ba, B:34:0x00c6, B:36:0x00cc, B:37:0x00e7, B:41:0x00ed, B:43:0x00f5, B:45:0x00f9, B:46:0x0107, B:53:0x0117, B:55:0x011d, B:59:0x014b, B:61:0x0153, B:62:0x015a, B:63:0x0161, B:58:0x0136, B:66:0x0164, B:67:0x0165, B:68:0x016c, B:69:0x016d, B:70:0x0174, B:73:0x0177, B:74:0x0178, B:76:0x0197, B:78:0x01aa, B:80:0x01b2, B:87:0x01ef, B:89:0x01f5, B:99:0x0218, B:100:0x021f, B:81:0x01c3, B:82:0x01ca, B:85:0x01ce, B:86:0x01df, B:101:0x0220, B:102:0x0227, B:103:0x0228, B:104:0x022f, B:109:0x023a), top: B:155:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc A[Catch: all -> 0x0133, LoadingException -> 0x0246, RemoteException -> 0x0248, TryCatch #7 {RemoteException -> 0x0248, LoadingException -> 0x0246, all -> 0x0133, blocks: (B:28:0x00ba, B:34:0x00c6, B:36:0x00cc, B:37:0x00e7, B:41:0x00ed, B:43:0x00f5, B:45:0x00f9, B:46:0x0107, B:53:0x0117, B:55:0x011d, B:59:0x014b, B:61:0x0153, B:62:0x015a, B:63:0x0161, B:58:0x0136, B:66:0x0164, B:67:0x0165, B:68:0x016c, B:69:0x016d, B:70:0x0174, B:73:0x0177, B:74:0x0178, B:76:0x0197, B:78:0x01aa, B:80:0x01b2, B:87:0x01ef, B:89:0x01f5, B:99:0x0218, B:100:0x021f, B:81:0x01c3, B:82:0x01ca, B:85:0x01ce, B:86:0x01df, B:101:0x0220, B:102:0x0227, B:103:0x0228, B:104:0x022f, B:109:0x023a), top: B:155:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ed A[Catch: all -> 0x0133, LoadingException -> 0x0246, RemoteException -> 0x0248, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0248, LoadingException -> 0x0246, all -> 0x0133, blocks: (B:28:0x00ba, B:34:0x00c6, B:36:0x00cc, B:37:0x00e7, B:41:0x00ed, B:43:0x00f5, B:45:0x00f9, B:46:0x0107, B:53:0x0117, B:55:0x011d, B:59:0x014b, B:61:0x0153, B:62:0x015a, B:63:0x0161, B:58:0x0136, B:66:0x0164, B:67:0x0165, B:68:0x016c, B:69:0x016d, B:70:0x0174, B:73:0x0177, B:74:0x0178, B:76:0x0197, B:78:0x01aa, B:80:0x01b2, B:87:0x01ef, B:89:0x01f5, B:99:0x0218, B:100:0x021f, B:81:0x01c3, B:82:0x01ca, B:85:0x01ce, B:86:0x01df, B:101:0x0220, B:102:0x0227, B:103:0x0228, B:104:0x022f, B:109:0x023a), top: B:155:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:69:0x016d A[Catch: all -> 0x0133, LoadingException -> 0x0246, RemoteException -> 0x0248, TryCatch #7 {RemoteException -> 0x0248, LoadingException -> 0x0246, all -> 0x0133, blocks: (B:28:0x00ba, B:34:0x00c6, B:36:0x00cc, B:37:0x00e7, B:41:0x00ed, B:43:0x00f5, B:45:0x00f9, B:46:0x0107, B:53:0x0117, B:55:0x011d, B:59:0x014b, B:61:0x0153, B:62:0x015a, B:63:0x0161, B:58:0x0136, B:66:0x0164, B:67:0x0165, B:68:0x016c, B:69:0x016d, B:70:0x0174, B:73:0x0177, B:74:0x0178, B:76:0x0197, B:78:0x01aa, B:80:0x01b2, B:87:0x01ef, B:89:0x01f5, B:99:0x0218, B:100:0x021f, B:81:0x01c3, B:82:0x01ca, B:85:0x01ce, B:86:0x01df, B:101:0x0220, B:102:0x0227, B:103:0x0228, B:104:0x022f, B:109:0x023a), top: B:155:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0178 A[Catch: all -> 0x0133, LoadingException -> 0x0246, RemoteException -> 0x0248, TryCatch #7 {RemoteException -> 0x0248, LoadingException -> 0x0246, all -> 0x0133, blocks: (B:28:0x00ba, B:34:0x00c6, B:36:0x00cc, B:37:0x00e7, B:41:0x00ed, B:43:0x00f5, B:45:0x00f9, B:46:0x0107, B:53:0x0117, B:55:0x011d, B:59:0x014b, B:61:0x0153, B:62:0x015a, B:63:0x0161, B:58:0x0136, B:66:0x0164, B:67:0x0165, B:68:0x016c, B:69:0x016d, B:70:0x0174, B:73:0x0177, B:74:0x0178, B:76:0x0197, B:78:0x01aa, B:80:0x01b2, B:87:0x01ef, B:89:0x01f5, B:99:0x0218, B:100:0x021f, B:81:0x01c3, B:82:0x01ca, B:85:0x01ce, B:86:0x01df, B:101:0x0220, B:102:0x0227, B:103:0x0228, B:104:0x022f, B:109:0x023a), top: B:155:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0197 A[Catch: all -> 0x0133, LoadingException -> 0x0246, RemoteException -> 0x0248, TryCatch #7 {RemoteException -> 0x0248, LoadingException -> 0x0246, all -> 0x0133, blocks: (B:28:0x00ba, B:34:0x00c6, B:36:0x00cc, B:37:0x00e7, B:41:0x00ed, B:43:0x00f5, B:45:0x00f9, B:46:0x0107, B:53:0x0117, B:55:0x011d, B:59:0x014b, B:61:0x0153, B:62:0x015a, B:63:0x0161, B:58:0x0136, B:66:0x0164, B:67:0x0165, B:68:0x016c, B:69:0x016d, B:70:0x0174, B:73:0x0177, B:74:0x0178, B:76:0x0197, B:78:0x01aa, B:80:0x01b2, B:87:0x01ef, B:89:0x01f5, B:99:0x0218, B:100:0x021f, B:81:0x01c3, B:82:0x01ca, B:85:0x01ce, B:86:0x01df, B:101:0x0220, B:102:0x0227, B:103:0x0228, B:104:0x022f, B:109:0x023a), top: B:155:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01aa A[Catch: all -> 0x0133, LoadingException -> 0x0246, RemoteException -> 0x0248, TryCatch #7 {RemoteException -> 0x0248, LoadingException -> 0x0246, all -> 0x0133, blocks: (B:28:0x00ba, B:34:0x00c6, B:36:0x00cc, B:37:0x00e7, B:41:0x00ed, B:43:0x00f5, B:45:0x00f9, B:46:0x0107, B:53:0x0117, B:55:0x011d, B:59:0x014b, B:61:0x0153, B:62:0x015a, B:63:0x0161, B:58:0x0136, B:66:0x0164, B:67:0x0165, B:68:0x016c, B:69:0x016d, B:70:0x0174, B:73:0x0177, B:74:0x0178, B:76:0x0197, B:78:0x01aa, B:80:0x01b2, B:87:0x01ef, B:89:0x01f5, B:99:0x0218, B:100:0x021f, B:81:0x01c3, B:82:0x01ca, B:85:0x01ce, B:86:0x01df, B:101:0x0220, B:102:0x0227, B:103:0x0228, B:104:0x022f, B:109:0x023a), top: B:155:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01b2 A[Catch: all -> 0x0133, LoadingException -> 0x0246, RemoteException -> 0x0248, TryCatch #7 {RemoteException -> 0x0248, LoadingException -> 0x0246, all -> 0x0133, blocks: (B:28:0x00ba, B:34:0x00c6, B:36:0x00cc, B:37:0x00e7, B:41:0x00ed, B:43:0x00f5, B:45:0x00f9, B:46:0x0107, B:53:0x0117, B:55:0x011d, B:59:0x014b, B:61:0x0153, B:62:0x015a, B:63:0x0161, B:58:0x0136, B:66:0x0164, B:67:0x0165, B:68:0x016c, B:69:0x016d, B:70:0x0174, B:73:0x0177, B:74:0x0178, B:76:0x0197, B:78:0x01aa, B:80:0x01b2, B:87:0x01ef, B:89:0x01f5, B:99:0x0218, B:100:0x021f, B:81:0x01c3, B:82:0x01ca, B:85:0x01ce, B:86:0x01df, B:101:0x0220, B:102:0x0227, B:103:0x0228, B:104:0x022f, B:109:0x023a), top: B:155:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3 A[Catch: all -> 0x0133, LoadingException -> 0x0246, RemoteException -> 0x0248, TryCatch #7 {RemoteException -> 0x0248, LoadingException -> 0x0246, all -> 0x0133, blocks: (B:28:0x00ba, B:34:0x00c6, B:36:0x00cc, B:37:0x00e7, B:41:0x00ed, B:43:0x00f5, B:45:0x00f9, B:46:0x0107, B:53:0x0117, B:55:0x011d, B:59:0x014b, B:61:0x0153, B:62:0x015a, B:63:0x0161, B:58:0x0136, B:66:0x0164, B:67:0x0165, B:68:0x016c, B:69:0x016d, B:70:0x0174, B:73:0x0177, B:74:0x0178, B:76:0x0197, B:78:0x01aa, B:80:0x01b2, B:87:0x01ef, B:89:0x01f5, B:99:0x0218, B:100:0x021f, B:81:0x01c3, B:82:0x01ca, B:85:0x01ce, B:86:0x01df, B:101:0x0220, B:102:0x0227, B:103:0x0228, B:104:0x022f, B:109:0x023a), top: B:155:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ce A[Catch: all -> 0x0133, LoadingException -> 0x0246, RemoteException -> 0x0248, TryCatch #7 {RemoteException -> 0x0248, LoadingException -> 0x0246, all -> 0x0133, blocks: (B:28:0x00ba, B:34:0x00c6, B:36:0x00cc, B:37:0x00e7, B:41:0x00ed, B:43:0x00f5, B:45:0x00f9, B:46:0x0107, B:53:0x0117, B:55:0x011d, B:59:0x014b, B:61:0x0153, B:62:0x015a, B:63:0x0161, B:58:0x0136, B:66:0x0164, B:67:0x0165, B:68:0x016c, B:69:0x016d, B:70:0x0174, B:73:0x0177, B:74:0x0178, B:76:0x0197, B:78:0x01aa, B:80:0x01b2, B:87:0x01ef, B:89:0x01f5, B:99:0x0218, B:100:0x021f, B:81:0x01c3, B:82:0x01ca, B:85:0x01ce, B:86:0x01df, B:101:0x0220, B:102:0x0227, B:103:0x0228, B:104:0x022f, B:109:0x023a), top: B:155:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01df A[Catch: all -> 0x0133, LoadingException -> 0x0246, RemoteException -> 0x0248, TryCatch #7 {RemoteException -> 0x0248, LoadingException -> 0x0246, all -> 0x0133, blocks: (B:28:0x00ba, B:34:0x00c6, B:36:0x00cc, B:37:0x00e7, B:41:0x00ed, B:43:0x00f5, B:45:0x00f9, B:46:0x0107, B:53:0x0117, B:55:0x011d, B:59:0x014b, B:61:0x0153, B:62:0x015a, B:63:0x0161, B:58:0x0136, B:66:0x0164, B:67:0x0165, B:68:0x016c, B:69:0x016d, B:70:0x0174, B:73:0x0177, B:74:0x0178, B:76:0x0197, B:78:0x01aa, B:80:0x01b2, B:87:0x01ef, B:89:0x01f5, B:99:0x0218, B:100:0x021f, B:81:0x01c3, B:82:0x01ca, B:85:0x01ce, B:86:0x01df, B:101:0x0220, B:102:0x0227, B:103:0x0228, B:104:0x022f, B:109:0x023a), top: B:155:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01f5 A[Catch: all -> 0x0133, LoadingException -> 0x0246, RemoteException -> 0x0248, TRY_LEAVE, TryCatch #7 {RemoteException -> 0x0248, LoadingException -> 0x0246, all -> 0x0133, blocks: (B:28:0x00ba, B:34:0x00c6, B:36:0x00cc, B:37:0x00e7, B:41:0x00ed, B:43:0x00f5, B:45:0x00f9, B:46:0x0107, B:53:0x0117, B:55:0x011d, B:59:0x014b, B:61:0x0153, B:62:0x015a, B:63:0x0161, B:58:0x0136, B:66:0x0164, B:67:0x0165, B:68:0x016c, B:69:0x016d, B:70:0x0174, B:73:0x0177, B:74:0x0178, B:76:0x0197, B:78:0x01aa, B:80:0x01b2, B:87:0x01ef, B:89:0x01f5, B:99:0x0218, B:100:0x021f, B:81:0x01c3, B:82:0x01ca, B:85:0x01ce, B:86:0x01df, B:101:0x0220, B:102:0x0227, B:103:0x0228, B:104:0x022f, B:109:0x023a), top: B:155:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0202  */
    /* JADX WARN: Code duplicated, block: B:93:0x0206  */
    /* JADX WARN: Code duplicated, block: B:96:0x0211  */
    /* JADX WARN: Code duplicated, block: B:99:0x0218 A[Catch: all -> 0x0133, LoadingException -> 0x0246, RemoteException -> 0x0248, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0248, LoadingException -> 0x0246, all -> 0x0133, blocks: (B:28:0x00ba, B:34:0x00c6, B:36:0x00cc, B:37:0x00e7, B:41:0x00ed, B:43:0x00f5, B:45:0x00f9, B:46:0x0107, B:53:0x0117, B:55:0x011d, B:59:0x014b, B:61:0x0153, B:62:0x015a, B:63:0x0161, B:58:0x0136, B:66:0x0164, B:67:0x0165, B:68:0x016c, B:69:0x016d, B:70:0x0174, B:73:0x0177, B:74:0x0178, B:76:0x0197, B:78:0x01aa, B:80:0x01b2, B:87:0x01ef, B:89:0x01f5, B:99:0x0218, B:100:0x021f, B:81:0x01c3, B:82:0x01ca, B:85:0x01ce, B:86:0x01df, B:101:0x0220, B:102:0x0227, B:103:0x0228, B:104:0x022f, B:109:0x023a), top: B:155:0x00ba }] */
    /* JADX WARN: Instruction removed from duplicated block: B:134:0x02be, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00cc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x0178, please report this as an issue */
    public static DynamiteModule c(Context context, QnHx qnHx, String str) {
        int i2;
        Boolean bool;
        zzq zzqVarH;
        int i3;
        IObjectWrapper iObjectWrapperM0;
        Object objM0;
        DynamiteModule dynamiteModule;
        j57 j57Var;
        Cursor cursor;
        zzr zzrVar;
        j57 j57Var2;
        Boolean boolValueOf;
        IObjectWrapper iObjectWrapperM1;
        Cursor cursor2;
        ThreadLocal threadLocal = j;
        j57 j57Var3 = (j57) threadLocal.get();
        j57 j57Var4 = new j57(0);
        threadLocal.set(j57Var4);
        nr5 nr5Var = k;
        long jLongValue = ((Long) nr5Var.get()).longValue();
        try {
            nr5Var.set(Long.valueOf(SystemClock.elapsedRealtime()));
            QnHx.CQf cQfA = qnHx.a(context, str, l);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + cQfA.a + " and remote module " + str + ":" + cQfA.b);
            int i4 = cQfA.c;
            if (i4 != 0) {
                if (i4 != -1) {
                    if (i4 == 1 || cQfA.b != 0) {
                        if (i4 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            DynamiteModule dynamiteModule2 = new DynamiteModule(context.getApplicationContext());
                            if (jLongValue == 0) {
                                nr5Var.remove();
                            } else {
                                nr5Var.set(Long.valueOf(jLongValue));
                            }
                            cursor2 = j57Var4.a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(j57Var3);
                            return dynamiteModule2;
                        }
                        if (i4 == 1) {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i4);
                        }
                        try {
                            i2 = cQfA.b;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (g(context)) {
                                        throw new LoadingException("Remote loading disabled");
                                    }
                                    bool = e;
                                }
                                if (bool != null) {
                                    throw new LoadingException("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                                    synchronized (DynamiteModule.class) {
                                        zzrVar = n;
                                    }
                                    if (zzrVar != null) {
                                        throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                    }
                                    j57Var2 = (j57) threadLocal.get();
                                    if (j57Var2 != null || j57Var2.a == null) {
                                        throw new LoadingException("No result cursor");
                                    }
                                    Context applicationContext = context.getApplicationContext();
                                    Cursor cursor3 = j57Var2.a;
                                    new ObjectWrapper(null);
                                    synchronized (DynamiteModule.class) {
                                        boolValueOf = Boolean.valueOf(h >= 2);
                                    }
                                    if (boolValueOf.booleanValue()) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        iObjectWrapperM1 = zzrVar.N0(new ObjectWrapper(applicationContext), str, i2, new ObjectWrapper(cursor3));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        iObjectWrapperM1 = zzrVar.M0(new ObjectWrapper(applicationContext), str, i2, new ObjectWrapper(cursor3));
                                    }
                                    Context context2 = (Context) ObjectWrapper.M0(iObjectWrapperM1);
                                    if (context2 == null) {
                                        throw new LoadingException("Failed to get module context");
                                    }
                                    dynamiteModule = new DynamiteModule(context2);
                                } else {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                                    zzqVarH = h(context);
                                    if (zzqVarH != null) {
                                        throw new LoadingException("Failed to create IDynamiteLoader.");
                                    }
                                    Parcel parcelK0 = zzqVarH.K0(zzqVarH.L0(), 6);
                                    i3 = parcelK0.readInt();
                                    parcelK0.recycle();
                                    if (i3 >= 3) {
                                        j57Var = (j57) threadLocal.get();
                                        if (j57Var != null) {
                                            throw new LoadingException("No cached result cursor holder");
                                        }
                                        iObjectWrapperM0 = zzqVarH.N0(new ObjectWrapper(context), str, i2, new ObjectWrapper(j57Var.a));
                                    } else if (i3 == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        iObjectWrapperM0 = zzqVarH.O0(new ObjectWrapper(context), str, i2);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        iObjectWrapperM0 = zzqVarH.M0(new ObjectWrapper(context), str, i2);
                                    }
                                    objM0 = ObjectWrapper.M0(iObjectWrapperM0);
                                    if (objM0 != null) {
                                        throw new LoadingException("Failed to load remote module.");
                                    }
                                    dynamiteModule = new DynamiteModule((Context) objM0);
                                }
                                if (jLongValue == 0) {
                                    nr5Var.remove();
                                } else {
                                    nr5Var.set(Long.valueOf(jLongValue));
                                }
                                cursor = j57Var4.a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                threadLocal.set(j57Var3);
                                return dynamiteModule;
                            } catch (RemoteException e2) {
                                throw new LoadingException("Failed to load remote module.", e2);
                            } catch (LoadingException e3) {
                                throw e3;
                            } catch (Throwable th) {
                                bb0.a(context, th);
                                throw new LoadingException("Failed to load remote module.", th);
                            }
                        } catch (LoadingException e4) {
                            Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                            int i5 = cQfA.a;
                            if (i5 == 0 || qnHx.a(context, str, new NUlFixed(i5)).c != -1) {
                                throw new LoadingException("Remote load failed. No local fallback found.", e4);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            DynamiteModule dynamiteModule3 = new DynamiteModule(context.getApplicationContext());
                            if (jLongValue == 0) {
                                k.remove();
                            } else {
                                k.set(Long.valueOf(jLongValue));
                            }
                            Cursor cursor4 = j57Var4.a;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            j.set(j57Var3);
                            return dynamiteModule3;
                        }
                    }
                } else if (cQfA.a != 0) {
                    i4 = -1;
                    if (i4 == 1) {
                    }
                    if (i4 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        DynamiteModule dynamiteModule4 = new DynamiteModule(context.getApplicationContext());
                        if (jLongValue == 0) {
                            nr5Var.remove();
                        } else {
                            nr5Var.set(Long.valueOf(jLongValue));
                        }
                        cursor2 = j57Var4.a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(j57Var3);
                        return dynamiteModule4;
                    }
                    if (i4 == 1) {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i4);
                    }
                    i2 = cQfA.b;
                    synchronized (DynamiteModule.class) {
                        if (g(context)) {
                            throw new LoadingException("Remote loading disabled");
                        }
                        bool = e;
                        if (bool != null) {
                            throw new LoadingException("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                            synchronized (DynamiteModule.class) {
                                zzrVar = n;
                                if (zzrVar != null) {
                                    throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                }
                                j57Var2 = (j57) threadLocal.get();
                                if (j57Var2 != null) {
                                }
                                throw new LoadingException("No result cursor");
                            }
                        }
                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i2);
                        zzqVarH = h(context);
                        if (zzqVarH != null) {
                            throw new LoadingException("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelK1 = zzqVarH.K0(zzqVarH.L0(), 6);
                        i3 = parcelK1.readInt();
                        parcelK1.recycle();
                        if (i3 >= 3) {
                            j57Var = (j57) threadLocal.get();
                            if (j57Var != null) {
                                throw new LoadingException("No cached result cursor holder");
                            }
                            iObjectWrapperM0 = zzqVarH.N0(new ObjectWrapper(context), str, i2, new ObjectWrapper(j57Var.a));
                        } else if (i3 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            iObjectWrapperM0 = zzqVarH.O0(new ObjectWrapper(context), str, i2);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            iObjectWrapperM0 = zzqVarH.M0(new ObjectWrapper(context), str, i2);
                        }
                        objM0 = ObjectWrapper.M0(iObjectWrapperM0);
                        if (objM0 != null) {
                            throw new LoadingException("Failed to load remote module.");
                        }
                        dynamiteModule = new DynamiteModule((Context) objM0);
                        if (jLongValue == 0) {
                            nr5Var.remove();
                        } else {
                            nr5Var.set(Long.valueOf(jLongValue));
                        }
                        cursor = j57Var4.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(j57Var3);
                        return dynamiteModule;
                    }
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + cQfA.a + " and remote version is " + cQfA.b + ".");
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                k.remove();
            } else {
                k.set(Long.valueOf(jLongValue));
            }
            Cursor cursor5 = j57Var4.a;
            if (cursor5 != null) {
                cursor5.close();
            }
            j.set(j57Var3);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a7 A[Catch: all -> 0x00b2, TryCatch #8 {all -> 0x00b2, blocks: (B:9:0x0027, B:11:0x0033, B:47:0x00b0, B:14:0x0039, B:16:0x0040, B:18:0x0046, B:21:0x0049, B:23:0x004d, B:26:0x0056, B:28:0x005e, B:31:0x0065, B:38:0x008f, B:39:0x0097, B:34:0x006c, B:36:0x0072, B:37:0x0081, B:42:0x009a, B:45:0x009d, B:46:0x00a7, B:15:0x003c), top: B:137:0x0027, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0171  */
    public static int d(Context context, String str, boolean z) {
        Throwable th;
        Cursor cursor;
        RemoteException e2;
        int i2;
        Cursor cursor2;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = e;
                boolean z2 = true;
                Cursor cursor3 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        f(classLoader);
                                    } catch (LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!g(context)) {
                                        return 0;
                                    }
                                    if (g) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iE = e(str, context, z, true);
                                                String str2 = f;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderA = y26.a();
                                                    if (classLoaderA == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            String str3 = f;
                                                            oa3.h(str3);
                                                            classLoaderA = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = f;
                                                            oa3.h(str4);
                                                            classLoaderA = new f76(ClassLoader.getSystemClassLoader(), str4);
                                                        }
                                                    }
                                                    f(classLoaderA);
                                                    declaredField.set(null, classLoaderA);
                                                    e = bool2;
                                                    return iE;
                                                }
                                                return iE;
                                            } catch (LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                e = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e3.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(str, context, z, false);
                    } catch (LoadingException e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                zzq zzqVarH = h(context);
                try {
                    if (zzqVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelK0 = zzqVarH.K0(zzqVarH.L0(), 6);
                        int i3 = parcelK0.readInt();
                        parcelK0.recycle();
                        if (i3 >= 3) {
                            ThreadLocal threadLocal = j;
                            j57 j57Var = (j57) threadLocal.get();
                            if (j57Var != null && (cursor2 = j57Var.a) != null) {
                                return cursor2.getInt(0);
                            }
                            cursor = (Cursor) ObjectWrapper.M0(zzqVarH.P0(new ObjectWrapper(context), str, z, ((Long) k.get()).longValue()));
                            if (cursor != null) {
                                try {
                                    if (cursor.moveToFirst()) {
                                        i2 = cursor.getInt(0);
                                        if (i2 > 0) {
                                            j57 j57Var2 = (j57) threadLocal.get();
                                            if (j57Var2 == null || j57Var2.a != null) {
                                                z2 = false;
                                            } else {
                                                j57Var2.a = cursor;
                                            }
                                            cursor3 = z2 ? null : cursor;
                                        }
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } catch (RemoteException e5) {
                                    e2 = e5;
                                    cursor3 = cursor;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                    if (cursor3 == null) {
                                        return 0;
                                    }
                                    cursor3.close();
                                    return 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor == null) {
                                return 0;
                            }
                            cursor.close();
                            return 0;
                        }
                        if (i3 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            ObjectWrapper objectWrapper = new ObjectWrapper(context);
                            Parcel parcelL0 = zzqVarH.L0();
                            i76.c(parcelL0, objectWrapper);
                            parcelL0.writeString(str);
                            parcelL0.writeInt(z ? 1 : 0);
                            Parcel parcelK1 = zzqVarH.K0(parcelL0, 5);
                            i2 = parcelK1.readInt();
                            parcelK1.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            ObjectWrapper objectWrapper2 = new ObjectWrapper(context);
                            Parcel parcelL1 = zzqVarH.L0();
                            i76.c(parcelL1, objectWrapper2);
                            parcelL1.writeString(str);
                            parcelL1.writeInt(z ? 1 : 0);
                            Parcel parcelK2 = zzqVarH.K0(parcelL1, 3);
                            i2 = parcelK2.readInt();
                            parcelK2.recycle();
                        }
                        return i2;
                    } catch (RemoteException e6) {
                        e2 = e6;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursor = null;
                }
            }
        } catch (Throwable th5) {
            bb0.a(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00d4 A[Catch: all -> 0x00dd, TryCatch #5 {all -> 0x00dd, blocks: (B:45:0x00a6, B:46:0x00ad, B:62:0x00cf, B:64:0x00d4, B:65:0x00d5, B:66:0x00dc), top: B:72:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d5 A[Catch: all -> 0x00dd, TryCatch #5 {all -> 0x00dd, blocks: (B:45:0x00a6, B:46:0x00ad, B:62:0x00cf, B:64:0x00d4, B:65:0x00d5, B:66:0x00dc), top: B:72:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1  */
    public static int e(String str, Context context, boolean z, boolean z2) throws Throwable {
        Exception e2;
        boolean z3;
        Cursor cursor = null;
        try {
            boolean z4 = true;
            Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) k.get()).longValue())).build(), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        boolean z5 = false;
                        int i2 = cursorQuery.getInt(0);
                        if (i2 > 0) {
                            synchronized (DynamiteModule.class) {
                                f = cursorQuery.getString(2);
                                int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                if (columnIndex >= 0) {
                                    h = cursorQuery.getInt(columnIndex);
                                }
                                int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                if (columnIndex2 >= 0) {
                                    z3 = cursorQuery.getInt(columnIndex2) != 0;
                                    g = z3;
                                } else {
                                    z3 = false;
                                }
                            }
                            j57 j57Var = (j57) j.get();
                            if (j57Var == null || j57Var.a != null) {
                                z4 = false;
                            } else {
                                j57Var.a = cursorQuery;
                            }
                            cursor = z4 ? null : cursorQuery;
                            z5 = z3;
                        } else {
                            cursor = cursorQuery;
                        }
                        if (!z2 || !z5) {
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i2;
                        }
                        try {
                            try {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl");
                            } catch (Throwable th) {
                                th = th;
                                th = th;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e2 = e3;
                            if (e2 instanceof LoadingException) {
                                throw e2;
                            }
                            throw new LoadingException("V2 version check failed", e2);
                        }
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    if (e2 instanceof LoadingException) {
                        throw e2;
                    }
                    throw new LoadingException("V2 version check failed", e2);
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            throw new LoadingException("Failed to connect to dynamite module ContentResolver.");
        } catch (Exception e5) {
            e2 = e5;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @GuardedBy("DynamiteModule.class")
    public static void f(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzr(iBinder);
            }
            n = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2);
        }
    }

    @GuardedBy("DynamiteModule.class")
    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(i)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (oa1.b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            i = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && providerInfoResolveContentProvider != null && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                g = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    public static zzq h(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = m;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    m = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws LoadingException {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e2);
        }
    }
}
