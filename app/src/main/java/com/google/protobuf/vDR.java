package com.google.protobuf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import defpackage.lk;
import defpackage.y45;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class vDR {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            lk.YKK ykk = lk.x;
            sb.append(y45.a(new lk.YKK(((String) obj).getBytes(SjP.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof lk) {
            sb.append(": \"");
            sb.append(y45.a((lk) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof LPt9Fixed) {
            sb.append(" {");
            c((LPt9Fixed) obj, sb, i + 2);
            sb.append("\n");
            a(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        b(sb, i3, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
        b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x020a  */
    /* JADX WARN: Code duplicated, block: B:133:0x020d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x020d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0164  */
    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    /* JADX WARN: Code duplicated, block: B:66:0x017e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0183  */
    /* JADX WARN: Code duplicated, block: B:69:0x018d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0191  */
    /* JADX WARN: Code duplicated, block: B:74:0x019b  */
    /* JADX WARN: Code duplicated, block: B:76:0x019f  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f4  */
    public static void c(DzVS dzVS, StringBuilder sb, int i) {
        int i2;
        Method method;
        Method method2;
        Object objF;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = dzVS.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method5 = declaredMethods[i3];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), LPt9Fixed.F(dzVS, method4, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), LPt9Fixed.F(dzVS, method3, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objF = LPt9Fixed.F(dzVS, method, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objF instanceof Boolean) {
                                    zEquals = !((Boolean) objF).booleanValue();
                                } else if (objF instanceof Integer) {
                                    if (((Integer) objF).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objF instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objF).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objF instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objF).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objF instanceof String) {
                                    zEquals = objF.equals("");
                                } else if (objF instanceof lk) {
                                    zEquals = objF.equals(lk.x);
                                } else if ((objF instanceof DzVS) ? !((objF instanceof Enum) && ((Enum) objF).ordinal() == 0) : objF != ((DzVS) objF).a()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) LPt9Fixed.F(dzVS, method2, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb, i, strSubstring, objF);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objF = LPt9Fixed.F(dzVS, method, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objF instanceof Boolean) {
                                zEquals = !((Boolean) objF).booleanValue();
                            } else if (objF instanceof Integer) {
                                if (((Integer) objF).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objF instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objF).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objF instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objF).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objF instanceof String) {
                                zEquals = objF.equals("");
                            } else if (objF instanceof lk) {
                                zEquals = objF.equals(lk.x);
                            } else if (objF instanceof DzVS) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) LPt9Fixed.F(dzVS, method2, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb, i, strSubstring, objF);
                        }
                    }
                }
            }
            i2 = 3;
        }
        if (dzVS instanceof LPt9Fixed.CQf) {
            Iterator<Map.Entry<T, Object>> itQ = ((LPt9Fixed.CQf) dzVS).A.q();
            while (itQ.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itQ.next();
                ((LPt9Fixed.F1) entry2.getKey()).getClass();
                b(sb, i, "[0]", entry2.getValue());
            }
        }
        Ck ck = ((LPt9Fixed) dzVS).y;
        if (ck != null) {
            for (int i4 = 0; i4 < ck.a; i4++) {
                b(sb, i, String.valueOf(ck.b[i4] >>> 3), ck.c[i4]);
            }
        }
    }
}
