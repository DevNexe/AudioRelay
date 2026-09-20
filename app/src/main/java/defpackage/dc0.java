package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class dc0 {
    public static final rt1 a;

    public interface QnHx<T> {
        T b(JsonReader jsonReader);
    }

    static {
        st1 st1Var = new st1();
        w1.a.a(st1Var);
        st1Var.d = true;
        a = new rt1(st1Var);
    }

    public static h3 a(JsonReader jsonReader) throws IOException {
        h3.QnHx qnHx = new h3.QnHx();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    qnHx.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    qnHx.b = strNextString;
                    break;
                    break;
                case "pc":
                    qnHx.a = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    qnHx.c = jsonReader.nextString();
                    break;
                case "importance":
                    qnHx.e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return qnHx.a();
    }

    public static s2 b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals(SubscriberAttributeKt.JSON_NAME_KEY)) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " key" : "";
        if (strNextString2 == null) {
            strConcat = strConcat.concat(" value");
        }
        if (strConcat.isEmpty()) {
            return new s2(strNextString, strNextString2);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public static <T> lj1<T> c(JsonReader jsonReader, QnHx<T> qnHx) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(qnHx.b(jsonReader));
        }
        jsonReader.endArray();
        return new lj1<>(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:127:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:156:0x0236  */
    /* JADX WARN: Code duplicated, block: B:227:0x0324  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:297:0x045f  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    public static a3 d(JsonReader jsonReader) throws IOException {
        byte b;
        String strConcat;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        a3.QnHx qnHx = new a3.QnHx();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            char c = 3;
            char c2 = 4;
            char c3 = 2;
            switch (strNextName) {
                case "device":
                    b = 0;
                    break;
                case "app":
                    b = 1;
                    break;
                case "log":
                    b = 2;
                    break;
                case "type":
                    b = 3;
                    break;
                case "timestamp":
                    b = 4;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b != 0) {
                if (b == 1) {
                    jsonReader.beginObject();
                    Integer numValueOf = null;
                    Boolean boolValueOf = null;
                    lj1 lj1Var = null;
                    lj1 lj1VarC = null;
                    c3 c3Var = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "background":
                                b2 = 0;
                                break;
                            case "execution":
                                b2 = 1;
                                break;
                            case "internalKeys":
                                b2 = 2;
                                break;
                            case "customAttributes":
                                b2 = 3;
                                break;
                            case "uiOrientation":
                                b2 = 4;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        if (b2 == 0) {
                            boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                        } else if (b2 == 1) {
                            jsonReader.beginObject();
                            lj1 lj1VarC2 = null;
                            e3 e3VarE = null;
                            r2 r2VarA = null;
                            f3 f3Var = null;
                            lj1 lj1VarC3 = null;
                            while (jsonReader.hasNext()) {
                                String strNextName3 = jsonReader.nextName();
                                strNextName3.getClass();
                                switch (strNextName3) {
                                    case "appExitInfo":
                                        b3 = 0;
                                        break;
                                    case "threads":
                                        b3 = 1;
                                        break;
                                    case "signal":
                                        b3 = 2;
                                        break;
                                    case "binaries":
                                        b3 = 3;
                                        break;
                                    case "exception":
                                        b3 = 4;
                                        break;
                                    default:
                                        b3 = -1;
                                        break;
                                }
                                if (b3 == 0) {
                                    r2.QnHx qnHx2 = new r2.QnHx();
                                    jsonReader.beginObject();
                                    while (jsonReader.hasNext()) {
                                        String strNextName4 = jsonReader.nextName();
                                        strNextName4.getClass();
                                        switch (strNextName4) {
                                            case "pid":
                                                qnHx2.a = Integer.valueOf(jsonReader.nextInt());
                                                break;
                                            case "pss":
                                                qnHx2.e = Long.valueOf(jsonReader.nextLong());
                                                break;
                                            case "rss":
                                                qnHx2.f = Long.valueOf(jsonReader.nextLong());
                                                break;
                                            case "timestamp":
                                                qnHx2.g = Long.valueOf(jsonReader.nextLong());
                                                break;
                                            case "processName":
                                                String strNextString = jsonReader.nextString();
                                                if (strNextString == null) {
                                                    throw new NullPointerException("Null processName");
                                                }
                                                qnHx2.b = strNextString;
                                                break;
                                                break;
                                            case "reasonCode":
                                                qnHx2.c = Integer.valueOf(jsonReader.nextInt());
                                                break;
                                            case "traceFile":
                                                qnHx2.h = jsonReader.nextString();
                                                break;
                                            case "importance":
                                                qnHx2.d = Integer.valueOf(jsonReader.nextInt());
                                                break;
                                            default:
                                                jsonReader.skipValue();
                                                break;
                                        }
                                    }
                                    jsonReader.endObject();
                                    r2VarA = qnHx2.a();
                                } else if (b3 == 1) {
                                    lj1VarC2 = c(jsonReader, new un(5));
                                } else if (b3 == c3) {
                                    jsonReader.beginObject();
                                    String strNextString2 = null;
                                    String strNextString3 = null;
                                    Long lValueOf = null;
                                    while (jsonReader.hasNext()) {
                                        String strNextName5 = jsonReader.nextName();
                                        strNextName5.getClass();
                                        int iHashCode = strNextName5.hashCode();
                                        if (iHashCode != -1147692044) {
                                            if (iHashCode != 3059181) {
                                                if (iHashCode == 3373707 && strNextName5.equals(MediationMetaData.KEY_NAME)) {
                                                    b4 = 2;
                                                } else {
                                                    b4 = -1;
                                                }
                                            } else if (strNextName5.equals("code")) {
                                                b4 = 1;
                                            } else {
                                                b4 = -1;
                                            }
                                        } else if (strNextName5.equals("address")) {
                                            b4 = 0;
                                        } else {
                                            b4 = -1;
                                        }
                                        if (b4 == 0) {
                                            lValueOf = Long.valueOf(jsonReader.nextLong());
                                        } else if (b4 == 1) {
                                            strNextString3 = jsonReader.nextString();
                                            if (strNextString3 == null) {
                                                throw new NullPointerException("Null code");
                                            }
                                        } else if (b4 != 2) {
                                            jsonReader.skipValue();
                                        } else {
                                            strNextString2 = jsonReader.nextString();
                                            if (strNextString2 == null) {
                                                throw new NullPointerException("Null name");
                                            }
                                        }
                                    }
                                    jsonReader.endObject();
                                    String strA = strNextString2 == null ? " name" : "";
                                    if (strNextString3 == null) {
                                        strA = strA.concat(" code");
                                    }
                                    if (lValueOf == null) {
                                        strA = rz.a(strA, " address");
                                    }
                                    if (!strA.isEmpty()) {
                                        throw new IllegalStateException("Missing required properties:".concat(strA));
                                    }
                                    f3Var = new f3(strNextString2, strNextString3, lValueOf.longValue());
                                } else if (b3 == c) {
                                    lj1VarC3 = c(jsonReader, new mk5(9));
                                } else if (b3 != c2) {
                                    jsonReader.skipValue();
                                } else {
                                    e3VarE = e(jsonReader);
                                }
                                c = 3;
                                c2 = 4;
                                c3 = 2;
                            }
                            jsonReader.endObject();
                            String strConcat2 = f3Var == null ? " signal" : "";
                            if (lj1VarC3 == null) {
                                strConcat2 = strConcat2.concat(" binaries");
                            }
                            if (!strConcat2.isEmpty()) {
                                throw new IllegalStateException("Missing required properties:".concat(strConcat2));
                            }
                            c3Var = new c3(lj1VarC2, e3VarE, r2VarA, f3Var, lj1VarC3);
                        } else if (b2 == c3) {
                            ArrayList arrayList = new ArrayList();
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add(b(jsonReader));
                            }
                            jsonReader.endArray();
                            lj1Var = new lj1(arrayList);
                        } else if (b2 == c) {
                            lj1VarC = c(jsonReader, new mk5(8));
                        } else if (b2 != c2) {
                            jsonReader.skipValue();
                        } else {
                            numValueOf = Integer.valueOf(jsonReader.nextInt());
                        }
                        c = 3;
                        c2 = 4;
                        c3 = 2;
                    }
                    jsonReader.endObject();
                    strConcat = c3Var == null ? " execution" : "";
                    if (numValueOf == null) {
                        strConcat = strConcat.concat(" uiOrientation");
                    }
                    if (!strConcat.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strConcat));
                    }
                    qnHx.c = new b3(c3Var, lj1VarC, lj1Var, boolValueOf, numValueOf.intValue());
                } else if (b == 2) {
                    jsonReader.beginObject();
                    String strNextString4 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName6 = jsonReader.nextName();
                        strNextName6.getClass();
                        if (strNextName6.equals("content")) {
                            strNextString4 = jsonReader.nextString();
                            if (strNextString4 == null) {
                                throw new NullPointerException("Null content");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    strConcat = strNextString4 == null ? " content" : "";
                    if (!strConcat.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(strConcat));
                    }
                    qnHx.e = new j3(strNextString4);
                } else if (b == 3) {
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null type");
                    }
                    qnHx.b = strNextString5;
                } else if (b != 4) {
                    jsonReader.skipValue();
                } else {
                    qnHx.a = Long.valueOf(jsonReader.nextLong());
                }
            } else {
                i3.QnHx qnHx3 = new i3.QnHx();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName7 = jsonReader.nextName();
                    strNextName7.getClass();
                    switch (strNextName7) {
                        case "batteryLevel":
                            b5 = 0;
                            break;
                        case "batteryVelocity":
                            b5 = 1;
                            break;
                        case "orientation":
                            b5 = 2;
                            break;
                        case "diskUsed":
                            b5 = 3;
                            break;
                        case "ramUsed":
                            b5 = 4;
                            break;
                        case "proximityOn":
                            b5 = 5;
                            break;
                        default:
                            b5 = -1;
                            break;
                    }
                    if (b5 == 0) {
                        qnHx3.a = Double.valueOf(jsonReader.nextDouble());
                    } else if (b5 == 1) {
                        qnHx3.b = Integer.valueOf(jsonReader.nextInt());
                    } else if (b5 == 2) {
                        qnHx3.d = Integer.valueOf(jsonReader.nextInt());
                    } else if (b5 == 3) {
                        qnHx3.f = Long.valueOf(jsonReader.nextLong());
                    } else if (b5 == 4) {
                        qnHx3.e = Long.valueOf(jsonReader.nextLong());
                    } else if (b5 != 5) {
                        jsonReader.skipValue();
                    } else {
                        qnHx3.c = Boolean.valueOf(jsonReader.nextBoolean());
                    }
                }
                jsonReader.endObject();
                qnHx.d = qnHx3.a();
            }
        }
        jsonReader.endObject();
        return qnHx.a();
    }

    public static e3 e(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        Integer numValueOf = null;
        String strNextString = null;
        String strNextString2 = null;
        lj1 lj1VarC = null;
        e3 e3VarE = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    lj1VarC = c(jsonReader, new un(6));
                    break;
                case "reason":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null type");
                    }
                    break;
                    break;
                case "causedBy":
                    e3VarE = e(jsonReader);
                    break;
                case "overflowCount":
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strA = strNextString == null ? " type" : "";
        if (lj1VarC == null) {
            strA = strA.concat(" frames");
        }
        if (numValueOf == null) {
            strA = rz.a(strA, " overflowCount");
        }
        if (strA.isEmpty()) {
            return new e3(strNextString, strNextString2, lj1VarC, e3VarE, numValueOf.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strA));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x0219  */
    /* JADX WARN: Code duplicated, block: B:213:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:280:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:94:0x0132  */
    public static p2 f(JsonReader jsonReader) throws IOException {
        byte b;
        byte b2;
        byte b3;
        Charset charset = bc0.a;
        p2.QnHx qnHx = new p2.QnHx();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    b = 0;
                    break;
                case "sdkVersion":
                    b = 1;
                    break;
                case "buildVersion":
                    b = 2;
                    break;
                case "gmpAppId":
                    b = 3;
                    break;
                case "installationUuid":
                    b = 4;
                    break;
                case "platform":
                    b = 5;
                    break;
                case "displayVersion":
                    b = 6;
                    break;
                case "session":
                    b = 7;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    jsonReader.beginObject();
                    lj1 lj1VarC = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            lj1VarC = c(jsonReader, new un(4));
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    String str = lj1VarC == null ? " files" : "";
                    if (!str.isEmpty()) {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                    qnHx.h = new t2(lj1VarC, strNextString);
                    break;
                    break;
                case 1:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    qnHx.a = strNextString2;
                    break;
                    break;
                case 2:
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    qnHx.e = strNextString3;
                    break;
                    break;
                case 3:
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    qnHx.b = strNextString4;
                    break;
                    break;
                case 4:
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    qnHx.d = strNextString5;
                    break;
                    break;
                case 5:
                    qnHx.c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 6:
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    qnHx.f = strNextString6;
                    break;
                    break;
                case 7:
                    v2.QnHx qnHx2 = new v2.QnHx();
                    qnHx2.e = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                qnHx2.c = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "identifier":
                                qnHx2.b = new String(Base64.decode(jsonReader.nextString(), 2), bc0.a);
                                break;
                            case "endedAt":
                                qnHx2.d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                z2.QnHx qnHx3 = new z2.QnHx();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            qnHx3.f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            qnHx3.h = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            qnHx3.d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "arch":
                                            qnHx3.a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "diskSpace":
                                            qnHx3.e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "cores":
                                            qnHx3.c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            qnHx3.b = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            qnHx3.g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            qnHx3.i = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                qnHx2.i = qnHx3.a();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(d(jsonReader));
                                }
                                jsonReader.endArray();
                                qnHx2.j = new lj1<>(arrayList);
                                break;
                            case "os":
                                k3.QnHx qnHx4 = new k3.QnHx();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            b2 = 0;
                                            break;
                                        case "jailbroken":
                                            b2 = 1;
                                            break;
                                        case "version":
                                            b2 = 2;
                                            break;
                                        case "platform":
                                            b2 = 3;
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    if (b2 == 0) {
                                        String strNextString10 = jsonReader.nextString();
                                        if (strNextString10 == null) {
                                            throw new NullPointerException("Null buildVersion");
                                        }
                                        qnHx4.c = strNextString10;
                                    } else if (b2 == 1) {
                                        qnHx4.d = Boolean.valueOf(jsonReader.nextBoolean());
                                    } else if (b2 == 2) {
                                        String strNextString11 = jsonReader.nextString();
                                        if (strNextString11 == null) {
                                            throw new NullPointerException("Null version");
                                        }
                                        qnHx4.b = strNextString11;
                                    } else if (b2 != 3) {
                                        jsonReader.skipValue();
                                    } else {
                                        qnHx4.a = Integer.valueOf(jsonReader.nextInt());
                                    }
                                }
                                jsonReader.endObject();
                                qnHx2.h = qnHx4.a();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            b3 = 0;
                                            break;
                                        case "developmentPlatform":
                                            b3 = 1;
                                            break;
                                        case "developmentPlatformVersion":
                                            b3 = 2;
                                            break;
                                        case "version":
                                            b3 = 3;
                                            break;
                                        case "installationUuid":
                                            b3 = 4;
                                            break;
                                        case "displayVersion":
                                            b3 = 5;
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    if (b3 == 0) {
                                        strNextString12 = jsonReader.nextString();
                                        if (strNextString12 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else if (b3 == 1) {
                                        strNextString16 = jsonReader.nextString();
                                    } else if (b3 == 2) {
                                        strNextString17 = jsonReader.nextString();
                                    } else if (b3 == 3) {
                                        strNextString13 = jsonReader.nextString();
                                        if (strNextString13 == null) {
                                            throw new NullPointerException("Null version");
                                        }
                                    } else if (b3 == 4) {
                                        strNextString15 = jsonReader.nextString();
                                    } else if (b3 != 5) {
                                        jsonReader.skipValue();
                                    } else {
                                        strNextString14 = jsonReader.nextString();
                                    }
                                }
                                jsonReader.endObject();
                                String strConcat = strNextString12 == null ? " identifier" : "";
                                if (strNextString13 == null) {
                                    strConcat = strConcat.concat(" version");
                                }
                                if (!strConcat.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(strConcat));
                                }
                                qnHx2.f = new x2(strNextString12, strNextString13, strNextString14, strNextString15, strNextString16, strNextString17);
                                break;
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName7 = jsonReader.nextName();
                                    strNextName7.getClass();
                                    if (strNextName7.equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                String str2 = strNextString18 == null ? " identifier" : "";
                                if (!str2.isEmpty()) {
                                    throw new IllegalStateException("Missing required properties:".concat(str2));
                                }
                                qnHx2.g = new l3(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                qnHx2.a = strNextString19;
                                break;
                                break;
                            case "crashed":
                                qnHx2.e = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case "generatorType":
                                qnHx2.k = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    qnHx.g = qnHx2.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return qnHx.a();
    }

    public static p2 g(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                p2 p2VarF = f(jsonReader);
                jsonReader.close();
                return p2VarF;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
