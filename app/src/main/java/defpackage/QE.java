package defpackage;

import android.util.Base64OutputStream;
import android.util.Log;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class QE implements Callable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ QE(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        FileInputStream fileInputStreamOpenFileInput;
        String reference;
        BufferedWriter bufferedWriter;
        String string;
        int i = 0;
        FileInputStream fileInputStream = null;
        g50 g50VarA = null;
        BufferedWriter bufferedWriter2 = null;
        switch (this.w) {
            case 0:
                return new TW(((Boolean) this.x).booleanValue());
            case 1:
                return Boolean.valueOf(((lKy3) ((ss3) this.x).y).o());
            case 2:
                gf5 gf5Var = (gf5) this.x;
                synchronized (gf5Var.f) {
                    if (gf5Var.f.isMarked()) {
                        reference = gf5Var.f.getReference();
                        gf5Var.f.set(reference, false);
                        i = 1;
                    } else {
                        reference = null;
                    }
                    break;
                }
                if (i != 0) {
                    File fileC = gf5Var.a.a.c(gf5Var.c, "user-data");
                    try {
                        String string2 = new yd2(reference).toString();
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC), zd2.b));
                        try {
                            bufferedWriter.write(string2);
                            bufferedWriter.flush();
                        } catch (Exception e) {
                            e = e;
                            try {
                                Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                            } catch (Throwable th) {
                                th = th;
                                bufferedWriter2 = bufferedWriter;
                                bufferedWriter = bufferedWriter2;
                                kw.a(bufferedWriter, "Failed to close user metadata file.");
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            kw.a(bufferedWriter, "Failed to close user metadata file.");
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedWriter = null;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedWriter = bufferedWriter2;
                        kw.a(bufferedWriter, "Failed to close user metadata file.");
                        throw th;
                    }
                    kw.a(bufferedWriter, "Failed to close user metadata file.");
                    break;
                }
                return null;
            case 3:
                ah0 ah0Var = (ah0) this.x;
                synchronized (ah0Var) {
                    uc1 uc1Var = ah0Var.a.get();
                    ArrayList arrayListC = uc1Var.c();
                    uc1Var.b();
                    JSONArray jSONArray = new JSONArray();
                    while (i < arrayListC.size()) {
                        vc1 vc1Var = (vc1) arrayListC.get(i);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", vc1Var.b());
                        jSONObject.put("dates", new JSONArray((Collection) vc1Var.a()));
                        jSONArray.put(jSONObject);
                        i++;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put(MediationMetaData.KEY_VERSION, "2");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        try {
                            gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                            gZIPOutputStream.close();
                            base64OutputStream.close();
                            string = byteArrayOutputStream.toString("UTF-8");
                        } catch (Throwable th4) {
                            try {
                                gZIPOutputStream.close();
                                break;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        try {
                            base64OutputStream.close();
                            break;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                }
                return string;
            default:
                k50 k50Var = (k50) this.x;
                synchronized (k50Var) {
                    try {
                        try {
                            fileInputStreamOpenFileInput = k50Var.a.openFileInput(k50Var.b);
                            try {
                                int iAvailable = fileInputStreamOpenFileInput.available();
                                byte[] bArr = new byte[iAvailable];
                                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                g50VarA = g50.a(new JSONObject(new String(bArr, "UTF-8")));
                                fileInputStreamOpenFileInput.close();
                            } catch (FileNotFoundException | JSONException unused) {
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                fileInputStream = fileInputStreamOpenFileInput;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                throw th;
                            }
                        } catch (FileNotFoundException | JSONException unused2) {
                            fileInputStreamOpenFileInput = null;
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return g50VarA;
        }
    }
}
