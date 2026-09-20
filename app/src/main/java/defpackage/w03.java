package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class w03 {
    public File a;
    public final qx0 b;

    public w03(qx0 qx0Var) {
        this.b = qx0Var;
    }

    public final File a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    qx0 qx0Var = this.b;
                    qx0Var.a();
                    this.a = new File(qx0Var.a.getFilesDir(), "PersistedInstallation." + this.b.c() + ".json");
                }
            }
        }
        return this.a;
    }

    public final void b(z3 z3Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", z3Var.b);
            jSONObject.put("Status", O.h(z3Var.c));
            jSONObject.put("AuthToken", z3Var.d);
            jSONObject.put("RefreshToken", z3Var.e);
            jSONObject.put("TokenCreationEpochInSecs", z3Var.g);
            jSONObject.put("ExpiresInSecs", z3Var.f);
            jSONObject.put("FisError", z3Var.h);
            qx0 qx0Var = this.b;
            qx0Var.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", qx0Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final z3 c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
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
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = x03.a;
        z3.QnHx qnHx = new z3.QnHx();
        qnHx.f = 0L;
        qnHx.b(1);
        qnHx.e = 0L;
        qnHx.a = strOptString;
        qnHx.b(O.j(5)[iOptInt]);
        qnHx.c = strOptString2;
        qnHx.d = strOptString3;
        qnHx.f = Long.valueOf(jOptLong);
        qnHx.e = Long.valueOf(jOptLong2);
        qnHx.g = strOptString4;
        return qnHx.a();
    }
}
