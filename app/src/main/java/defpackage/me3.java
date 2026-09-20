package defpackage;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class me3 {

    @Nullable
    public static String a;
    public static int b;

    public static String a() throws Throwable {
        String strTrim;
        if (a == null) {
            int iMyPid = b;
            if (iMyPid == 0) {
                iMyPid = Process.myPid();
                b = iMyPid;
            }
            String str = null;
            BufferedReader bufferedReader = null;
            BufferedReader bufferedReader2 = null;
            if (iMyPid > 0) {
                try {
                    String str2 = "/proc/" + iMyPid + "/cmdline";
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        BufferedReader bufferedReader3 = new BufferedReader(new FileReader(str2));
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        try {
                            String line = bufferedReader3.readLine();
                            oa3.h(line);
                            strTrim = line.trim();
                        } catch (IOException unused) {
                            strTrim = null;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader3;
                            gh1.a(bufferedReader2);
                            throw th;
                        }
                        bufferedReader = bufferedReader3;
                        gh1.a(bufferedReader);
                        str = strTrim;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th2;
                    }
                } catch (IOException unused2) {
                    strTrim = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            a = str;
        }
        return a;
    }
}
