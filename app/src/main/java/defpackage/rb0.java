package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class rb0 {
    public static final gb0 r = new FilenameFilter() { // from class: gb0
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };
    public final Context a;
    public final oe0 b;
    public final ss3 c;
    public final gf5 d;
    public final db0 e;
    public final th1 f;
    public final fx0 g;
    public final Ncry h;
    public final m52 i;
    public final yb0 j;
    public final b2J k;
    public final dg4 l;
    public hc0 m;
    public final z05<Boolean> n = new z05<>();
    public final z05<Boolean> o = new z05<>();
    public final z05<Void> p = new z05<>();
    public final AtomicBoolean q = new AtomicBoolean(false);

    public rb0(Context context, db0 db0Var, th1 th1Var, oe0 oe0Var, fx0 fx0Var, ss3 ss3Var, Ncry ncry, gf5 gf5Var, m52 m52Var, dg4 dg4Var, yb0 yb0Var, b2J b2j) {
        this.a = context;
        this.e = db0Var;
        this.f = th1Var;
        this.b = oe0Var;
        this.g = fx0Var;
        this.c = ss3Var;
        this.h = ncry;
        this.d = gf5Var;
        this.i = m52Var;
        this.j = yb0Var;
        this.k = b2j;
        this.l = dg4Var;
    }

    public static void a(rb0 rb0Var, String str) {
        Integer num;
        rb0Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strA = b70.a("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strA, null);
        }
        Locale locale = Locale.US;
        String str2 = String.format(locale, "Crashlytics Android SDK/%s", "18.2.13");
        th1 th1Var = rb0Var.f;
        String str3 = th1Var.c;
        Ncry ncry = rb0Var.h;
        e4 e4Var = new e4(str3, ncry.e, ncry.f, th1Var.c(), fj0.b(ncry.c != null ? 4 : 1), ncry.g);
        String str4 = Build.VERSION.RELEASE;
        String str5 = Build.VERSION.CODENAME;
        h4 h4Var = new h4(str4, str5, kw.j());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        kw.QnHx qnHx = kw.QnHx.UNKNOWN;
        String str6 = Build.CPU_ABI;
        boolean zIsEmpty = TextUtils.isEmpty(str6);
        kw.QnHx qnHx2 = kw.QnHx.UNKNOWN;
        if (!zIsEmpty) {
            kw.QnHx qnHx3 = (kw.QnHx) kw.QnHx.x.get(str6.toLowerCase(locale));
            if (qnHx3 != null) {
                qnHx2 = qnHx3;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = qnHx2.ordinal();
        String str7 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jG = kw.g();
        boolean zI = kw.i();
        int iD = kw.d();
        String str8 = Build.MANUFACTURER;
        String str9 = Build.PRODUCT;
        rb0Var.j.d(str, str2, jCurrentTimeMillis, new d4(e4Var, h4Var, new f4(iOrdinal, str7, iAvailableProcessors, jG, blockCount, zI, iD, str8, str9)));
        rb0Var.i.a(str);
        dg4 dg4Var = rb0Var.l;
        cc0 cc0Var = dg4Var.a;
        cc0Var.getClass();
        Charset charset = bc0.a;
        p2.QnHx qnHx4 = new p2.QnHx();
        qnHx4.a = "18.2.13";
        Ncry ncry2 = cc0Var.c;
        String str10 = ncry2.a;
        if (str10 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        qnHx4.b = str10;
        th1 th1Var2 = cc0Var.b;
        String strC = th1Var2.c();
        if (strC == null) {
            throw new NullPointerException("Null installationUuid");
        }
        qnHx4.d = strC;
        String str11 = ncry2.e;
        if (str11 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        qnHx4.e = str11;
        String str12 = ncry2.f;
        if (str12 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        qnHx4.f = str12;
        qnHx4.c = 4;
        v2.QnHx qnHx5 = new v2.QnHx();
        qnHx5.e = Boolean.FALSE;
        qnHx5.c = Long.valueOf(jCurrentTimeMillis);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        qnHx5.b = str;
        String str13 = cc0.f;
        if (str13 == null) {
            throw new NullPointerException("Null generator");
        }
        qnHx5.a = str13;
        String str14 = th1Var2.c;
        if (str14 == null) {
            throw new NullPointerException("Null identifier");
        }
        String strC2 = th1Var2.c();
        fk0 fk0Var = ncry2.g;
        if (fk0Var.b == null) {
            fk0Var.b = new fk0.QnHx(fk0Var);
        }
        fk0.QnHx qnHx6 = fk0Var.b;
        String str15 = qnHx6.a;
        if (qnHx6 == null) {
            fk0Var.b = new fk0.QnHx(fk0Var);
        }
        qnHx5.f = new x2(str14, str11, str12, strC2, str15, fk0Var.b.b);
        k3.QnHx qnHx7 = new k3.QnHx();
        qnHx7.a = 3;
        qnHx7.b = str4;
        qnHx7.c = str5;
        qnHx7.d = Boolean.valueOf(kw.j());
        qnHx5.h = qnHx7.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = (TextUtils.isEmpty(str6) || (num = (Integer) cc0.e.get(str6.toLowerCase(locale))) == null) ? 7 : num.intValue();
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jG2 = kw.g();
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zI2 = kw.i();
        int iD2 = kw.d();
        z2.QnHx qnHx8 = new z2.QnHx();
        qnHx8.a = Integer.valueOf(iIntValue);
        qnHx8.b = str7;
        qnHx8.c = Integer.valueOf(iAvailableProcessors2);
        qnHx8.d = Long.valueOf(jG2);
        qnHx8.e = Long.valueOf(blockCount2);
        qnHx8.f = Boolean.valueOf(zI2);
        qnHx8.g = Integer.valueOf(iD2);
        qnHx8.h = str8;
        qnHx8.i = str9;
        qnHx5.i = qnHx8.a();
        qnHx5.k = 3;
        qnHx4.g = qnHx5.a();
        p2 p2VarA = qnHx4.a();
        fx0 fx0Var = dg4Var.b.b;
        bc0.NUlFixed nUl = p2VarA.h;
        if (nUl == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String strG = nUl.g();
        try {
            fc0.f.getClass();
            rt1 rt1Var = dc0.a;
            rt1Var.getClass();
            StringWriter stringWriter = new StringWriter();
            try {
                rt1Var.a(p2VarA, stringWriter);
            } catch (IOException unused) {
            }
            fc0.e(fx0Var.c(strG, "report"), stringWriter.toString());
            File fileC = fx0Var.c(strG, "start-time");
            long jI = nUl.i();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileC), fc0.d);
            try {
                outputStreamWriter.write("");
                fileC.setLastModified(jI * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            String strA2 = b70.a("Could not persist report for session ", strG);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strA2, e);
            }
        }
    }

    public static kc7 b(rb0 rb0Var) {
        boolean z;
        kc7 kc7VarC;
        rb0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : fx0.f(rb0Var.g.b.listFiles(r))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    kc7VarC = k15.e(null);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    kc7VarC = k15.c(new qb0(rb0Var, j), new ScheduledThreadPoolExecutor(1));
                }
                arrayList.add(kc7VarC);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return k15.f(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x047e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0492  */
    /* JADX WARN: Code duplicated, block: B:143:0x049c  */
    /* JADX WARN: Code duplicated, block: B:146:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:147:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:149:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:152:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:156:0x04f9 A[LOOP:3: B:156:0x04f9->B:161:0x0516, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:158:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:160:0x0512  */
    /* JADX WARN: Code duplicated, block: B:165:0x052c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0540  */
    /* JADX WARN: Code duplicated, block: B:170:0x055c  */
    /* JADX WARN: Code duplicated, block: B:172:0x056b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0571  */
    /* JADX WARN: Code duplicated, block: B:177:0x0587  */
    /* JADX WARN: Code duplicated, block: B:184:0x05ab A[Catch: IOException -> 0x05dd, TryCatch #15 {IOException -> 0x05dd, blocks: (B:178:0x058e, B:179:0x0595, B:181:0x05a3, B:182:0x05a6, B:184:0x05ab, B:186:0x05b7, B:201:0x05d5, B:200:0x05d2, B:203:0x05d7, B:204:0x05dc), top: B:254:0x058e, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:210:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:211:0x060c  */
    /* JADX WARN: Code duplicated, block: B:215:0x0631 A[Catch: IOException -> 0x0681, TRY_ENTER, TryCatch #13 {IOException -> 0x0681, blocks: (B:212:0x0619, B:215:0x0631, B:219:0x064d, B:221:0x0664, B:223:0x0671, B:220:0x0659, B:224:0x0679, B:225:0x0680), top: B:250:0x0619 }] */
    /* JADX WARN: Code duplicated, block: B:217:0x064a  */
    /* JADX WARN: Code duplicated, block: B:218:0x064b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x064d A[Catch: IOException -> 0x0681, TryCatch #13 {IOException -> 0x0681, blocks: (B:212:0x0619, B:215:0x0631, B:219:0x064d, B:221:0x0664, B:223:0x0671, B:220:0x0659, B:224:0x0679, B:225:0x0680), top: B:250:0x0619 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x0659 A[Catch: IOException -> 0x0681, TryCatch #13 {IOException -> 0x0681, blocks: (B:212:0x0619, B:215:0x0631, B:219:0x064d, B:221:0x0664, B:223:0x0671, B:220:0x0659, B:224:0x0679, B:225:0x0680), top: B:250:0x0619 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x0679 A[Catch: IOException -> 0x0681, TryCatch #13 {IOException -> 0x0681, blocks: (B:212:0x0619, B:215:0x0631, B:219:0x064d, B:221:0x0664, B:223:0x0671, B:220:0x0659, B:224:0x0679, B:225:0x0680), top: B:250:0x0619 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:235:0x06ca A[LOOP:7: B:233:0x06c4->B:235:0x06ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:236:0x06d4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:282:0x0516 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0693 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x02aa  */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x047e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:210:0x05f8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x02aa, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c(boolean z, rh4 rh4Var) throws Throwable {
        ArrayList arrayList;
        fx0 fx0Var;
        yb0 yb0Var;
        Object obj;
        long jCurrentTimeMillis;
        fx0 fx0Var2;
        File file;
        boolean z2;
        NavigableSet<String> navigableSetDescendingSet;
        int size;
        File file2;
        ArrayList arrayListB;
        int size2;
        Iterator it;
        String strA;
        List listF;
        ArrayList arrayList2;
        Iterator it2;
        boolean z3;
        boolean zHasNext;
        dc0 dc0Var;
        File fileC;
        p2 p2VarI;
        lj1<bc0.NUlFixed.LPt8Fixed> lj1Var;
        bc0.NUlFixed nUl;
        p2 p2VarA;
        bc0.NUlFixed nUl2;
        File file3;
        File file4;
        JsonReader jsonReader;
        String name;
        boolean z4;
        String strA2;
        String strA3;
        kK kKVar;
        File fileD;
        Throwable th;
        InputStream inputStreamB;
        ApplicationExitInfo applicationExitInfo;
        String string;
        rb0 rb0Var = this;
        dg4 dg4Var = rb0Var.l;
        fc0 fc0Var = dg4Var.b;
        fc0Var.getClass();
        ArrayList arrayList3 = new ArrayList(new TreeSet(fx0.f(fc0Var.b.c.list())).descendingSet());
        if (arrayList3.size() <= z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str = (String) arrayList3.get(z ? 1 : 0);
        boolean z5 = ((xg4) rh4Var).h.get().b.b;
        fc0 fc0Var2 = dg4Var.b;
        fx0 fx0Var3 = rb0Var.g;
        if (z5) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                List historicalProcessExitReasons = ((ActivityManager) rb0Var.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    m52 m52Var = new m52(fx0Var3, str);
                    zd2 zd2Var = new zd2(fx0Var3);
                    gf5 gf5Var = new gf5(str, fx0Var3, rb0Var.e);
                    gf5Var.d.a.getReference().c(zd2Var.b(str, false));
                    gf5Var.e.a.getReference().c(zd2Var.b(str, true));
                    gf5Var.f.set(zd2Var.c(str), false);
                    long jLastModified = fc0Var2.b.c(str, "start-time").lastModified();
                    Iterator it3 = historicalProcessExitReasons.iterator();
                    do {
                        if (it3.hasNext()) {
                            applicationExitInfo = (ApplicationExitInfo) it3.next();
                            if (applicationExitInfo.getTimestamp() < jLastModified) {
                            }
                        }
                        applicationExitInfo = null;
                        break;
                    } while (applicationExitInfo.getReason() != 6);
                    if (applicationExitInfo == null) {
                        String strA4 = b70.a("No relevant ApplicationExitInfo occurred during session: ", str);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strA4, null);
                        }
                        arrayList = arrayList3;
                        fx0Var = fx0Var3;
                    } else {
                        try {
                            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                            if (traceInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[8192];
                                while (true) {
                                    int i2 = traceInputStream.read(bArr);
                                    if (i2 == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i2);
                                    }
                                    string = null;
                                }
                                string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                            } else {
                                string = null;
                            }
                        } catch (IOException e) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e, null);
                        }
                        r2.QnHx qnHx = new r2.QnHx();
                        qnHx.d = Integer.valueOf(applicationExitInfo.getImportance());
                        String processName = applicationExitInfo.getProcessName();
                        if (processName == null) {
                            throw new NullPointerException("Null processName");
                        }
                        qnHx.b = processName;
                        qnHx.c = Integer.valueOf(applicationExitInfo.getReason());
                        qnHx.g = Long.valueOf(applicationExitInfo.getTimestamp());
                        qnHx.a = Integer.valueOf(applicationExitInfo.getPid());
                        qnHx.e = Long.valueOf(applicationExitInfo.getPss());
                        qnHx.f = Long.valueOf(applicationExitInfo.getRss());
                        qnHx.h = string;
                        r2 r2VarA = qnHx.a();
                        cc0 cc0Var = dg4Var.a;
                        int i3 = cc0Var.a.getResources().getConfiguration().orientation;
                        a3.QnHx qnHx2 = new a3.QnHx();
                        qnHx2.b = "anr";
                        qnHx2.a = Long.valueOf(r2VarA.g);
                        Boolean boolValueOf = Boolean.valueOf(r2VarA.d != 100);
                        Integer numValueOf = Integer.valueOf(i3);
                        Long l = 0L;
                        String str2 = l == null ? " address" : "";
                        if (!str2.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str2));
                        }
                        arrayList = arrayList3;
                        fx0Var = fx0Var3;
                        c3 c3Var = new c3(null, null, r2VarA, new f3("0", "0", l.longValue()), cc0Var.a());
                        String strConcat = numValueOf == null ? "".concat(" uiOrientation") : "";
                        if (!strConcat.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strConcat));
                        }
                        qnHx2.c = new b3(c3Var, null, null, boolValueOf, numValueOf.intValue());
                        qnHx2.d = cc0Var.b(i3);
                        a3 a3VarA = qnHx2.a();
                        String strA5 = b70.a("Persisting anr for session ", str);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", strA5, null);
                        }
                        fc0Var2.c(dg4.a(a3VarA, m52Var, gf5Var), str, true);
                    }
                    yb0Var = rb0Var.j;
                    if (yb0Var.c(str)) {
                        kKVar = kK.x;
                        kKVar.h("Finalizing native report for session " + str);
                        fk2 fk2VarA = yb0Var.a(str);
                        fileD = fk2VarA.d();
                        if (fileD == null && fileD.exists()) {
                            long jLastModified2 = fileD.lastModified();
                            fx0 fx0Var4 = fx0Var;
                            m52 m52Var2 = new m52(fx0Var4, str);
                            File fileB = fx0Var4.b(str);
                            if (fileB.isDirectory()) {
                                rb0Var.d(jLastModified2);
                                byte[] bArrC = m52Var2.b.c();
                                File fileC2 = fx0Var4.c(str, "user-data");
                                File fileC3 = fx0Var4.c(str, "keys");
                                ArrayList<ek2> arrayList4 = new ArrayList();
                                arrayList4.add(new ok(bArrC));
                                arrayList4.add(new cx0("crash_meta_file", "metadata", fk2VarA.f()));
                                arrayList4.add(new cx0("session_meta_file", "session", fk2VarA.e()));
                                arrayList4.add(new cx0("app_meta_file", "app", fk2VarA.a()));
                                arrayList4.add(new cx0("device_meta_file", "device", fk2VarA.c()));
                                arrayList4.add(new cx0("os_meta_file", "os", fk2VarA.b()));
                                arrayList4.add(new cx0("minidump_file", "minidump", fk2VarA.d()));
                                arrayList4.add(new cx0("user_meta_file", "user", fileC2));
                                arrayList4.add(new cx0("keys_file", "keys", fileC3));
                                for (ek2 ek2Var : arrayList4) {
                                    try {
                                        inputStreamB = ek2Var.b();
                                        if (inputStreamB != null) {
                                            try {
                                                Th.m(new File(fileB, ek2Var.a()), inputStreamB);
                                            } catch (IOException unused) {
                                            } catch (Throwable th2) {
                                                th = th2;
                                                if (inputStreamB != null) {
                                                    try {
                                                        inputStreamB.close();
                                                    } catch (RuntimeException e2) {
                                                        throw e2;
                                                    } catch (Exception unused2) {
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (IOException unused3) {
                                        inputStreamB = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStreamB = null;
                                    }
                                    if (inputStreamB != null) {
                                        try {
                                            inputStreamB.close();
                                        } catch (RuntimeException e3) {
                                            throw e3;
                                        } catch (Exception unused4) {
                                        }
                                    }
                                }
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    th = null;
                                    Log.d("FirebaseCrashlytics", "CrashlyticsController#finalizePreviousNativeSession", null);
                                } else {
                                    th = null;
                                }
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", "SessionReportingCoordinator#finalizeSessionWithNativeEvent", th);
                                }
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it4 = arrayList4.iterator();
                                while (it4.hasNext()) {
                                    u2 u2VarC = ((ek2) it4.next()).c();
                                    if (u2VarC != null) {
                                        arrayList5.add(u2VarC);
                                    }
                                }
                                t2 t2Var = new t2(new lj1(arrayList5), null);
                                fx0 fx0Var5 = fc0Var2.b;
                                File fileC4 = fx0Var5.c(str, "report");
                                String str3 = "Writing native session report for " + str + " to file: " + fileC4;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str3, null);
                                }
                                try {
                                    dc0 dc0Var2 = fc0.f;
                                    String strD = fc0.d(fileC4);
                                    dc0Var2.getClass();
                                    p2.QnHx qnHx3 = new p2.QnHx(dc0.g(strD));
                                    qnHx3.g = null;
                                    qnHx3.h = t2Var;
                                    Object objA = qnHx3.a();
                                    File file5 = new File(fx0Var5.f, str);
                                    rt1 rt1Var = dc0.a;
                                    rt1Var.getClass();
                                    StringWriter stringWriter = new StringWriter();
                                    try {
                                        rt1Var.a(objA, stringWriter);
                                    } catch (IOException unused5) {
                                    }
                                    fc0.e(file5, stringWriter.toString());
                                } catch (IOException e4) {
                                    Log.w("FirebaseCrashlytics", "Could not synthesize final native report file for " + fileC4, e4);
                                }
                                m52Var2.b.d();
                            } else {
                                kKVar.i("Couldn't create directory to store native session files, aborting.", null);
                            }
                        } else {
                            kKVar.i("No minidump data found for session " + str, null);
                        }
                    }
                    if (z != 0) {
                        obj = (String) arrayList.get(0);
                    } else {
                        obj = null;
                    }
                    jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    fx0Var2 = fc0Var2.b;
                    fx0Var2.getClass();
                    file = fx0Var2.a;
                    fx0.a(new File(file, ".com.google.firebase.crashlytics"));
                    fx0.a(new File(file, ".com.google.firebase.crashlytics-ndk"));
                    if (Build.VERSION.SDK_INT >= 28) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        fx0.a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
                    }
                    navigableSetDescendingSet = new TreeSet(fx0.f(fc0Var2.b.c.list())).descendingSet();
                    if (obj != null) {
                        navigableSetDescendingSet.remove(obj);
                    }
                    size = navigableSetDescendingSet.size();
                    file2 = fx0Var2.c;
                    if (size > 8) {
                        while (navigableSetDescendingSet.size() > 8) {
                            String str4 = (String) navigableSetDescendingSet.last();
                            strA3 = b70.a("Removing session over cap: ", str4);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", strA3, null);
                            }
                            fx0.e(new File(file2, str4));
                            navigableSetDescendingSet.remove(str4);
                        }
                    }
                    for (String str5 : navigableSetDescendingSet) {
                        strA = b70.a("Finalizing report for session ", str5);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strA, null);
                        }
                        ec0 ec0Var = fc0.h;
                        File file6 = new File(file2, str5);
                        file6.mkdirs();
                        listF = fx0.f(file6.listFiles(ec0Var));
                        if (!listF.isEmpty()) {
                            Collections.sort(listF);
                            arrayList2 = new ArrayList();
                            it2 = listF.iterator();
                            while (true) {
                                z3 = false;
                                while (true) {
                                    zHasNext = it2.hasNext();
                                    dc0Var = fc0.f;
                                    if (zHasNext) {
                                        if (!arrayList2.isEmpty()) {
                                            String strC = new zd2(fx0Var2).c(str5);
                                            fileC = fx0Var2.c(str5, "report");
                                            try {
                                                String strD2 = fc0.d(fileC);
                                                dc0Var.getClass();
                                                p2VarI = dc0.g(strD2).i(jCurrentTimeMillis, strC, z3);
                                                lj1Var = new lj1<>(arrayList2);
                                                nUl = p2VarI.h;
                                                if (nUl != null) {
                                                    throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                                }
                                                p2.QnHx qnHx4 = new p2.QnHx(p2VarI);
                                                v2.QnHx qnHxL = nUl.l();
                                                qnHxL.j = lj1Var;
                                                qnHx4.g = qnHxL.a();
                                                p2VarA = qnHx4.a();
                                                nUl2 = p2VarA.h;
                                                if (nUl2 != null) {
                                                    break;
                                                }
                                                if (z3) {
                                                    file3 = new File(fx0Var2.e, nUl2.g());
                                                } else {
                                                    file3 = new File(fx0Var2.d, nUl2.g());
                                                }
                                                rt1 rt1Var2 = dc0.a;
                                                rt1Var2.getClass();
                                                StringWriter stringWriter2 = new StringWriter();
                                                try {
                                                    rt1Var2.a(p2VarA, stringWriter2);
                                                } catch (IOException unused6) {
                                                }
                                                fc0.e(file3, stringWriter2.toString());
                                                break;
                                            } catch (IOException e5) {
                                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileC, e5);
                                                break;
                                            }
                                        }
                                        Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str5, null);
                                        break;
                                    }
                                    file4 = (File) it2.next();
                                    try {
                                        String strD3 = fc0.d(file4);
                                        dc0Var.getClass();
                                        try {
                                            jsonReader = new JsonReader(new StringReader(strD3));
                                            try {
                                                a3 a3VarD = dc0.d(jsonReader);
                                                jsonReader.close();
                                                arrayList2.add(a3VarD);
                                                if (!z3) {
                                                    name = file4.getName();
                                                    if (name.startsWith("event") || !name.endsWith("_")) {
                                                        z4 = false;
                                                    } else {
                                                        z4 = true;
                                                    }
                                                    if (!z4) {
                                                        break;
                                                    }
                                                }
                                                z3 = true;
                                            } catch (Throwable th4) {
                                                try {
                                                    jsonReader.close();
                                                } catch (Throwable th5) {
                                                    th4.addSuppressed(th5);
                                                }
                                                throw th4;
                                            }
                                        } catch (IllegalStateException e6) {
                                            throw new IOException(e6);
                                        }
                                    } catch (IOException e7) {
                                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file4, e7);
                                    }
                                }
                            }
                        } else {
                            strA2 = fc2.a("Session ", str5, " has no events.");
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", strA2, null);
                            }
                        }
                        fx0.e(new File(file2, str5));
                    }
                    ((xg4) fc0Var2.c).h.get().a.getClass();
                    arrayListB = fc0Var2.b();
                    size2 = arrayListB.size();
                    if (size2 <= 4) {
                        return;
                    }
                    it = arrayListB.subList(4, size2).iterator();
                    while (it.hasNext()) {
                        ((File) it.next()).delete();
                    }
                }
                arrayList = arrayList3;
                fx0Var = fx0Var3;
                String strA6 = b70.a("No ApplicationExitInfo available. Session: ", str);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strA6, null);
                }
            } else {
                arrayList = arrayList3;
                fx0Var = fx0Var3;
                String strA7 = GM.a("ANR feature enabled, but device is API ", i);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strA7, null);
                }
            }
        } else {
            arrayList = arrayList3;
            fx0Var = fx0Var3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        rb0Var = this;
        yb0Var = rb0Var.j;
        if (yb0Var.c(str)) {
            kKVar = kK.x;
            kKVar.h("Finalizing native report for session " + str);
            fk2 fk2VarA2 = yb0Var.a(str);
            fileD = fk2VarA2.d();
            if (fileD == null) {
                kKVar.i("No minidump data found for session " + str, null);
            } else {
                kKVar.i("No minidump data found for session " + str, null);
            }
        }
        if (z != 0) {
            obj = (String) arrayList.get(0);
        } else {
            obj = null;
        }
        jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        fx0Var2 = fc0Var2.b;
        fx0Var2.getClass();
        file = fx0Var2.a;
        fx0.a(new File(file, ".com.google.firebase.crashlytics"));
        fx0.a(new File(file, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT >= 28) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            fx0.a(new File(file, ".com.google.firebase.crashlytics.files.v1"));
        }
        navigableSetDescendingSet = new TreeSet(fx0.f(fc0Var2.b.c.list())).descendingSet();
        if (obj != null) {
            navigableSetDescendingSet.remove(obj);
        }
        size = navigableSetDescendingSet.size();
        file2 = fx0Var2.c;
        if (size > 8) {
            while (navigableSetDescendingSet.size() > 8) {
                String str6 = (String) navigableSetDescendingSet.last();
                strA3 = b70.a("Removing session over cap: ", str6);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strA3, null);
                }
                fx0.e(new File(file2, str6));
                navigableSetDescendingSet.remove(str6);
            }
        }
        while (r6.hasNext()) {
            strA = b70.a("Finalizing report for session ", str5);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strA, null);
            }
            ec0 ec0Var2 = fc0.h;
            File file7 = new File(file2, str5);
            file7.mkdirs();
            listF = fx0.f(file7.listFiles(ec0Var2));
            if (!listF.isEmpty()) {
                strA2 = fc2.a("Session ", str5, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strA2, null);
                }
            } else {
                Collections.sort(listF);
                arrayList2 = new ArrayList();
                it2 = listF.iterator();
                while (true) {
                    z3 = false;
                    while (true) {
                        zHasNext = it2.hasNext();
                        dc0Var = fc0.f;
                        if (zHasNext) {
                            if (!arrayList2.isEmpty()) {
                                Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str5, null);
                                break;
                                break;
                            }
                            String strC2 = new zd2(fx0Var2).c(str5);
                            fileC = fx0Var2.c(str5, "report");
                            String strD4 = fc0.d(fileC);
                            dc0Var.getClass();
                            p2VarI = dc0.g(strD4).i(jCurrentTimeMillis, strC2, z3);
                            lj1Var = new lj1<>(arrayList2);
                            nUl = p2VarI.h;
                            if (nUl != null) {
                                throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                            }
                            p2.QnHx qnHx5 = new p2.QnHx(p2VarI);
                            v2.QnHx qnHxL2 = nUl.l();
                            qnHxL2.j = lj1Var;
                            qnHx5.g = qnHxL2.a();
                            p2VarA = qnHx5.a();
                            nUl2 = p2VarA.h;
                            if (nUl2 != null) {
                                break;
                                break;
                            }
                            if (z3) {
                                file3 = new File(fx0Var2.e, nUl2.g());
                            } else {
                                file3 = new File(fx0Var2.d, nUl2.g());
                            }
                            rt1 rt1Var3 = dc0.a;
                            rt1Var3.getClass();
                            StringWriter stringWriter3 = new StringWriter();
                            rt1Var3.a(p2VarA, stringWriter3);
                            fc0.e(file3, stringWriter3.toString());
                            break;
                            break;
                        }
                        file4 = (File) it2.next();
                        String strD5 = fc0.d(file4);
                        dc0Var.getClass();
                        jsonReader = new JsonReader(new StringReader(strD5));
                        a3 a3VarD2 = dc0.d(jsonReader);
                        jsonReader.close();
                        arrayList2.add(a3VarD2);
                        if (!z3) {
                            name = file4.getName();
                            if (name.startsWith("event")) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                                break;
                            }
                        }
                        z3 = true;
                    }
                }
            }
            fx0.e(new File(file2, str5));
        }
        ((xg4) fc0Var2.c).h.get().a.getClass();
        arrayListB = fc0Var2.b();
        size2 = arrayListB.size();
        if (size2 <= 4) {
            return;
        }
        it = arrayListB.subList(4, size2).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public final void d(long j) {
        try {
            fx0 fx0Var = this.g;
            String str = ".ae" + j;
            fx0Var.getClass();
            if (new File(fx0Var.b, str).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
    }

    public final boolean e(rh4 rh4Var) throws Throwable {
        if (!Boolean.TRUE.equals(this.e.d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        hc0 hc0Var = this.m;
        if (hc0Var != null && hc0Var.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            c(true, rh4Var);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String f() {
        fc0 fc0Var = this.l.b;
        fc0Var.getClass();
        NavigableSet navigableSetDescendingSet = new TreeSet(fx0.f(fc0Var.b.c.list())).descendingSet();
        if (navigableSetDescendingSet.isEmpty()) {
            return null;
        }
        return (String) navigableSetDescendingSet.first();
    }

    public final w05 g(kc7 kc7Var) {
        kc7<Void> kc7Var2;
        w05 w05VarE;
        fx0 fx0Var = this.l.b.b;
        boolean z = (fx0.f(fx0Var.d.listFiles()).isEmpty() && fx0.f(fx0Var.e.listFiles()).isEmpty() && fx0.f(fx0Var.f.listFiles()).isEmpty()) ? false : true;
        z05<Boolean> z05Var = this.n;
        if (!z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            z05Var.c(Boolean.FALSE);
            return k15.e(null);
        }
        kK kKVar = kK.x;
        kKVar.h("Crash reports are available to be sent.");
        oe0 oe0Var = this.b;
        if (oe0Var.b()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            z05Var.c(Boolean.FALSE);
            w05VarE = k15.e(Boolean.TRUE);
        } else {
            kKVar.c("Automatic data collection is disabled.");
            kKVar.h("Notifying that unsent reports are available.");
            z05Var.c(Boolean.TRUE);
            synchronized (oe0Var.c) {
                kc7Var2 = oe0Var.d.a;
            }
            w05<TContinuationResult> w05VarO = kc7Var2.o(new FWT());
            kKVar.c("Waiting for send/deleteUnsentReports to be called.");
            kc7<Boolean> kc7Var3 = this.o.a;
            ExecutorService executorService = tf5.a;
            z05 z05Var2 = new z05();
            vK0u vk0u = new vK0u(z05Var2, 7);
            w05VarO.g(vk0u);
            kc7Var3.g(vk0u);
            w05VarE = z05Var2.a;
        }
        return w05VarE.o(new mb0(this, kc7Var));
    }
}
