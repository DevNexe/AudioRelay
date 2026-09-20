package defpackage;

import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.webkit.WebSettings;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class yb7 {
    public final Application a;
    public final Handler b;
    public final Executor c;
    public final gy5 d;
    public final d36 e;
    public final l57 f;
    public final e61 g;
    public final mw6 h;

    public yb7(Application application, Handler handler, t76 t76Var, gy5 gy5Var, d36 d36Var, l57 l57Var, e61 e61Var, mw6 mw6Var) {
        this.a = application;
        this.b = handler;
        this.c = t76Var;
        this.d = gy5Var;
        this.e = d36Var;
        this.f = l57Var;
        this.g = e61Var;
        this.h = mw6Var;
    }

    public final i66 a(d66 d66Var) throws zzj {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = d66Var.a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    Boolean bool = d66Var.b;
                    if (bool != null) {
                        jsonWriter.name("is_lat");
                        jsonWriter.value(bool.booleanValue());
                    }
                    String str2 = d66Var.c;
                    if (str2 != null) {
                        jsonWriter.name("adid");
                        jsonWriter.value(str2);
                    }
                    uh1 uh1Var = d66Var.d;
                    if (uh1Var != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i = uh1Var.a;
                        if (i != 1) {
                            jsonWriter.name("os_type");
                            if (i == 0) {
                                throw null;
                            }
                            if (i - 1 != 0) {
                                jsonWriter.value("ANDROID");
                            } else {
                                jsonWriter.value("UNKNOWN");
                            }
                        }
                        String str3 = (String) uh1Var.b;
                        if (str3 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str3);
                        }
                        Integer num = (Integer) uh1Var.c;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str4 = d66Var.e;
                    if (str4 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str4);
                    }
                    Boolean bool2 = d66Var.f;
                    if (bool2 != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool2.booleanValue());
                    }
                    Map<String, String> map = d66Var.g;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            jsonWriter.name(entry.getKey());
                            jsonWriter.value(entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    j95 j95Var = d66Var.h;
                    if (j95Var != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) j95Var.a;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) j95Var.b;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = (Double) j95Var.c;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<m56> list = (List) j95Var.d;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (m56 m56Var : list) {
                                jsonWriter.beginObject();
                                Integer num4 = m56Var.a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = m56Var.b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = m56Var.c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = m56Var.d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    rx5 rx5Var = d66Var.i;
                    if (rx5Var != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str5 = (String) rx5Var.a;
                        if (str5 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = (String) rx5Var.b;
                        if (str6 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str6);
                        }
                        String str7 = (String) rx5Var.c;
                        if (str7 != null) {
                            jsonWriter.name(MediationMetaData.KEY_VERSION);
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    w56 w56Var = d66Var.j;
                    if (w56Var != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str8 = w56Var.w;
                        if (str8 != null) {
                            jsonWriter.name(MediationMetaData.KEY_VERSION);
                            jsonWriter.value(str8);
                        }
                        jsonWriter.endObject();
                    }
                    List<b56> list2 = d66Var.k;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator<b56> it = list2.iterator();
                        while (it.hasNext()) {
                            int iOrdinal = it.next().ordinal();
                            if (iOrdinal == 0) {
                                jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                            } else if (iOrdinal == 1) {
                                jsonWriter.value("ALWAYS_SHOW");
                            } else if (iOrdinal == 2) {
                                jsonWriter.value("GEO_OVERRIDE_EEA");
                            } else if (iOrdinal == 3) {
                                jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                            } else if (iOrdinal == 4) {
                                jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        String next = new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next();
                        StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 31);
                        sb.append("Http error code - ");
                        sb.append(responseCode);
                        sb.append(".\n");
                        sb.append(next);
                        throw new IOException(sb.toString());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        i66 i66VarA = i66.a(new JsonReader(new StringReader(headerField)));
                        i66VarA.a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return i66VarA;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            i66 i66VarA2 = i66.a(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return i66VarA2;
                        } catch (Throwable th) {
                            try {
                                jsonReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        jsonWriter.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        } catch (SocketTimeoutException e) {
            throw new zzj(4, "The server timed out.", e);
        } catch (IOException e2) {
            throw new zzj(2, "Error making request.", e2);
        }
    }
}
