package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class z60 {
    public final SparseArray<QnHx> a = new SparseArray<>();
    public final SparseArray<androidx.constraintlayout.widget.CQf> b = new SparseArray<>();

    public static class CQf {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final int e;

        public CQf(Context context, XmlResourceParser xmlResourceParser) {
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), g7.G);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                    this.e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        new androidx.constraintlayout.widget.CQf().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.d = typedArrayObtainStyledAttributes.getDimension(index, this.d);
                } else if (index == 2) {
                    this.b = typedArrayObtainStyledAttributes.getDimension(index, this.b);
                } else if (index == 3) {
                    this.c = typedArrayObtainStyledAttributes.getDimension(index, this.c);
                } else if (index == 4) {
                    this.a = typedArrayObtainStyledAttributes.getDimension(index, this.a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class QnHx {
        public final int a;
        public final ArrayList<CQf> b = new ArrayList<>();
        public final int c;

        public QnHx(Context context, XmlResourceParser xmlResourceParser) {
            this.c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), g7.E);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.a = typedArrayObtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.c);
                    this.c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        new androidx.constraintlayout.widget.CQf().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public z60(Context context, int i) {
        byte b;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            QnHx qnHx = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b = 4;
                            } else {
                                b = -1;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b = 3;
                            } else {
                                b = -1;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b != 0 && b != 1) {
                        if (b == 2) {
                            QnHx qnHx2 = new QnHx(context, xml);
                            this.a.put(qnHx2.a, qnHx2);
                            qnHx = qnHx2;
                        } else if (b == 3) {
                            CQf cQf = new CQf(context, xml);
                            if (qnHx != null) {
                                qnHx.b.add(cQf);
                            }
                        } else if (b != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            a(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        androidx.constraintlayout.widget.CQf.QnHx qnHxD;
        androidx.constraintlayout.widget.CQf cQf = new androidx.constraintlayout.widget.CQf();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (FacebookAdapter.KEY_ID.equals(xmlResourceParser.getAttributeName(i))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), FacebookAdapter.KEY_ID, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    androidx.constraintlayout.widget.CQf.QnHx qnHx = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            switch (xmlResourceParser.getName()) {
                                case "Constraint":
                                    qnHxD = androidx.constraintlayout.widget.CQf.d(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case "Guideline":
                                    qnHxD = androidx.constraintlayout.widget.CQf.d(context, Xml.asAttributeSet(xmlResourceParser));
                                    qnHxD.d.a = true;
                                    break;
                                case "Barrier":
                                    qnHxD = androidx.constraintlayout.widget.CQf.d(context, Xml.asAttributeSet(xmlResourceParser));
                                    qnHxD.d.c0 = 1;
                                    break;
                                case "PropertySet":
                                    if (qnHx == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    qnHx.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    continue;
                                    break;
                                    break;
                                case "Transform":
                                    if (qnHx == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    qnHx.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    continue;
                                    break;
                                    break;
                                case "Layout":
                                    if (qnHx == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    qnHx.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    continue;
                                    break;
                                    break;
                                case "Motion":
                                    if (qnHx == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    qnHx.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    continue;
                                    break;
                                    break;
                                case "CustomAttribute":
                                    if (qnHx == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    x60.a(context, xmlResourceParser, qnHx.f);
                                    continue;
                                    break;
                                    break;
                                default:
                                    continue;
                                    break;
                            }
                            qnHx = qnHxD;
                        } else if (eventType != 3) {
                            continue;
                        } else {
                            String name = xmlResourceParser.getName();
                            if ("ConstraintSet".equals(name)) {
                                this.b.put(identifier, cQf);
                                return;
                            } else if (name.equalsIgnoreCase("Constraint")) {
                                cQf.c.put(Integer.valueOf(qnHx.a), qnHx);
                                qnHx = null;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                }
                this.b.put(identifier, cQf);
                return;
            }
        }
    }
}
