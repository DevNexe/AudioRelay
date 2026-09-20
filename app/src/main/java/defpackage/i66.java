package defpackage;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i66 {
    public String a;
    public String b;
    public String c;
    public int f = 1;
    public List<String> d = Collections.emptyList();
    public List<g66> e = Collections.emptyList();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f9  */
    public static i66 a(JsonReader jsonReader) throws IOException {
        byte b;
        byte b2;
        byte b3;
        int i;
        i66 i66Var = new i66();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int i2 = 5;
            switch (jsonReader.nextName()) {
                case "consent_signal":
                    b = 0;
                    break;
                case "error_message":
                    b = 3;
                    break;
                case "consent_form_base_url":
                    b = 2;
                    break;
                case "actions":
                    b = 5;
                    break;
                case "request_info_keys":
                    b = 4;
                    break;
                case "consent_form_payload":
                    b = 1;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                String strNextString = jsonReader.nextString();
                switch (strNextString) {
                    case "CONSENT_SIGNAL_UNKNOWN":
                        i2 = 1;
                        i66Var.f = i2;
                        break;
                    case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                        i2 = 2;
                        i66Var.f = i2;
                        break;
                    case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                        i2 = 3;
                        i66Var.f = i2;
                        break;
                    case "CONSENT_SIGNAL_SUFFICIENT":
                        i2 = 4;
                        i66Var.f = i2;
                        break;
                    case "CONSENT_SIGNAL_COLLECT_CONSENT":
                        i66Var.f = i2;
                        break;
                    case "CONSENT_SIGNAL_NOT_REQUIRED":
                        i2 = 6;
                        i66Var.f = i2;
                        break;
                    case "CONSENT_SIGNAL_ERROR":
                        i2 = 7;
                        i66Var.f = i2;
                        break;
                    case "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION":
                        i2 = 8;
                        i66Var.f = i2;
                        break;
                    default:
                        throw new IOException(strNextString.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: "));
                }
            } else if (b == 1) {
                i66Var.a = jsonReader.nextString();
            } else if (b == 2) {
                i66Var.b = jsonReader.nextString();
            } else if (b == 3) {
                i66Var.c = jsonReader.nextString();
            } else if (b == 4) {
                i66Var.d = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    i66Var.d.add(jsonReader.nextString());
                }
                jsonReader.endArray();
            } else if (b != 5) {
                jsonReader.skipValue();
            } else {
                i66Var.e = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    g66 g66Var = new g66();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName = jsonReader.nextName();
                        int iHashCode = strNextName.hashCode();
                        if (iHashCode != -2105551094) {
                            if (iHashCode == 1583758243 && strNextName.equals("action_type")) {
                                b2 = 0;
                            } else {
                                b2 = -1;
                            }
                        } else if (strNextName.equals("args_json")) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                        if (b2 == 0) {
                            String strNextString2 = jsonReader.nextString();
                            int iHashCode2 = strNextString2.hashCode();
                            if (iHashCode2 != 64208429) {
                                if (iHashCode2 != 82862015) {
                                    if (iHashCode2 == 1856333582 && strNextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                        b3 = 0;
                                    } else {
                                        b3 = -1;
                                    }
                                } else if (strNextString2.equals("WRITE")) {
                                    b3 = 1;
                                } else {
                                    b3 = -1;
                                }
                            } else if (strNextString2.equals("CLEAR")) {
                                b3 = 2;
                            } else {
                                b3 = -1;
                            }
                            if (b3 == 0) {
                                i = 1;
                            } else if (b3 == 1) {
                                i = 2;
                            } else {
                                if (b3 != 2) {
                                    throw new IOException(strNextString2.length() != 0 ? "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString2) : new String("Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: "));
                                }
                                i = 3;
                            }
                            g66Var.b = i;
                        } else if (b2 != 1) {
                            jsonReader.skipValue();
                        } else {
                            g66Var.a = jsonReader.nextString();
                        }
                    }
                    jsonReader.endObject();
                    i66Var.e.add(g66Var);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        return i66Var;
    }
}
