package com.google.android.gms.internal.measurement;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import defpackage.X;
import defpackage.a07;
import defpackage.f27;
import defpackage.n47;
import defpackage.q37;
import defpackage.vz6;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class roZB {
    public static final void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            vz6 vz6Var = a07.x;
            sb.append(X.I(new vz6(((String) obj).getBytes(f27.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof a07) {
            sb.append(": \"");
            sb.append(X.I((a07) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof vDR) {
            sb.append(" {");
            c((vDR) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
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
        int i4 = i + 2;
        a(sb, i4, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
        a(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static void c(q37 q37Var, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : q37Var.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strConcat = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 4)));
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb, i, b(strConcat), vDR.l(q37Var, method2, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strConcat2 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 3)));
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb, i, b(strConcat2), vDR.l(q37Var, method3, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strSubstring))) != null && (!strSubstring.endsWith("Bytes") || !map.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                String strConcat3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1)));
                Method method4 = (Method) map.get("get".concat(strSubstring));
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objL = vDR.l(q37Var, method4, new Object[0]);
                    if (method5 == null) {
                        if (objL instanceof Boolean) {
                            if (((Boolean) objL).booleanValue()) {
                                a(sb, i, b(strConcat3), objL);
                            }
                        } else if (objL instanceof Integer) {
                            if (((Integer) objL).intValue() != 0) {
                                a(sb, i, b(strConcat3), objL);
                            }
                        } else if (objL instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objL).floatValue()) != 0) {
                                a(sb, i, b(strConcat3), objL);
                            }
                        } else if (!(objL instanceof Double)) {
                            if (objL instanceof String) {
                                zEquals = objL.equals("");
                            } else if (objL instanceof a07) {
                                zEquals = objL.equals(a07.x);
                            } else if (objL instanceof q37) {
                                if (objL != ((q37) objL).c()) {
                                    a(sb, i, b(strConcat3), objL);
                                }
                            } else if (!(objL instanceof Enum) || ((Enum) objL).ordinal() != 0) {
                                a(sb, i, b(strConcat3), objL);
                            }
                            if (!zEquals) {
                                a(sb, i, b(strConcat3), objL);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objL).doubleValue()) != 0) {
                            a(sb, i, b(strConcat3), objL);
                        }
                    } else if (((Boolean) vDR.l(q37Var, method5, new Object[0])).booleanValue()) {
                        a(sb, i, b(strConcat3), objL);
                    }
                }
            }
        }
        if (q37Var instanceof DzVS) {
            throw null;
        }
        n47 n47Var = ((vDR) q37Var).zzc;
        if (n47Var != null) {
            for (int i2 = 0; i2 < n47Var.a; i2++) {
                a(sb, i, String.valueOf(n47Var.b[i2] >>> 3), n47Var.c[i2]);
            }
        }
    }
}
