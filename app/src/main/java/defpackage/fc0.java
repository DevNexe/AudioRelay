package defpackage;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class fc0 {
    public static final Charset d = Charset.forName("UTF-8");
    public static final int e = 15;
    public static final dc0 f = new dc0();
    public static final xy1 g = new xy1(1);
    public static final ec0 h = new ec0(1);
    public final AtomicInteger a = new AtomicInteger(0);
    public final fx0 b;
    public final rh4 c;

    public fc0(fx0 fx0Var, xg4 xg4Var) {
        this.b = fx0Var;
        this.c = xg4Var;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String d(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), d);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void e(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        fx0 fx0Var = this.b;
        arrayList.addAll(fx0.f(fx0Var.e.listFiles()));
        arrayList.addAll(fx0.f(fx0Var.f.listFiles()));
        xy1 xy1Var = g;
        Collections.sort(arrayList, xy1Var);
        List listF = fx0.f(fx0Var.d.listFiles());
        Collections.sort(listF, xy1Var);
        arrayList.addAll(listF);
        return arrayList;
    }

    public final void c(a3 a3Var, String str, boolean z) {
        fx0 fx0Var = this.b;
        int i = ((xg4) this.c).h.get().a.a;
        f.getClass();
        rt1 rt1Var = dc0.a;
        rt1Var.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            rt1Var.a(a3Var, stringWriter);
        } catch (IOException unused) {
        }
        try {
            e(fx0Var.c(str, fc2.a("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? "_" : "")), stringWriter.toString());
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        ec0 ec0Var = new ec0(0);
        fx0Var.getClass();
        File file = new File(fx0Var.c, str);
        file.mkdirs();
        List<File> listF = fx0.f(file.listFiles(ec0Var));
        Collections.sort(listF, new sy1(2));
        int size = listF.size();
        for (File file2 : listF) {
            if (size <= i) {
                return;
            }
            fx0.e(file2);
            size--;
        }
    }
}
