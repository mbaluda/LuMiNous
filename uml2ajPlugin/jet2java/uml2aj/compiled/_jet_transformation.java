package uml2aj.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;
import org.eclipse.jet.JET2Template;

public class _jet_transformation implements JET2TemplateLoader, JET2TemplateLoaderExtension {

    private static final class TemplateFactoryMethod {

        private final String templatePath;
        private final String templateClass;

        public TemplateFactoryMethod(String templatePath, String templateClass) {
            this.templatePath = templatePath;
            this.templateClass = templateClass;
            
        }
        
        public String getTemplateClass() {
            return this.templateClass;
        }

        public String getTemplatePath() {
            return this.templatePath;
        }

        public JET2Template newTemplate() {
            JET2Template template = null;
            try {
                template = (JET2Template) Class.forName(this.templateClass).newInstance();
            } catch (InstantiationException e) {
                // ignore
            } catch (IllegalAccessException e) {
                // ignore
            } catch (ClassNotFoundException e) {
                // ignore
            }
            return template;
        }
        
        
    }

    private Map pathToFactoryMap = null;
    
    private JET2TemplateLoader delegate = null;

    public _jet_transformation() {
        super();
    }

    public JET2Template getTemplate(String templatePath) {
        if(this.pathToFactoryMap == null) {
            initPathToFactoryMap();
        }
        TemplateFactoryMethod factory = (TemplateFactoryMethod)this.pathToFactoryMap.get(templatePath);
        return factory == null ? this.delegate == null ? null : this.delegate.getTemplate(templatePath) : factory.newTemplate();
    }

    private void addTemplate(String templatePath, String templateClass) {
        this.pathToFactoryMap.put(templatePath,
            new TemplateFactoryMethod(templatePath, templateClass));
    }
    
    private void initPathToFactoryMap() {
        this.pathToFactoryMap = new HashMap(16);
            addTemplate("templates/AssociationUnique.aj.jet", "org.eclipse.jet.compiled._jet_AssociationUniqueaj" ); //$NON-NLS-1$  //$NON-NLS-2$
            addTemplate("templates/Comparable.aj.jet", "org.eclipse.jet.compiled._jet_Comparableaj" ); //$NON-NLS-1$  //$NON-NLS-2$
            addTemplate("templates/GlobalUnique.aj.jet", "org.eclipse.jet.compiled._jet_GlobalUniqueaj" ); //$NON-NLS-1$  //$NON-NLS-2$
            addTemplate("templates/Immutable.aj.jet", "org.eclipse.jet.compiled._jet_Immutableaj" ); //$NON-NLS-1$  //$NON-NLS-2$
            addTemplate("templates/Initialized.aj.jet", "org.eclipse.jet.compiled._jet_Initializedaj" ); //$NON-NLS-1$  //$NON-NLS-2$
            addTemplate("templates/Language.aj.jet", "org.eclipse.jet.compiled._jet_Languageaj" ); //$NON-NLS-1$  //$NON-NLS-2$
            addTemplate("templates/LanguageProp.aj.jet", "org.eclipse.jet.compiled._jet_LanguagePropaj" ); //$NON-NLS-1$  //$NON-NLS-2$
            addTemplate("templates/NotNullInitialized.aj.jet", "org.eclipse.jet.compiled._jet_NotNullInitializedaj" ); //$NON-NLS-1$  //$NON-NLS-2$
            addTemplate("templates/NotNullParameter.aj.jet", "org.eclipse.jet.compiled._jet_NotNullParameteraj" ); //$NON-NLS-1$  //$NON-NLS-2$
            addTemplate("templates/NotNullReturn.aj.jet", "org.eclipse.jet.compiled._jet_NotNullReturnaj" ); //$NON-NLS-1$  //$NON-NLS-2$
            addTemplate("templates/UniqueContainer.java.jet", "org.eclipse.jet.compiled._jet_UniqueContainerjava" ); //$NON-NLS-1$  //$NON-NLS-2$
            addTemplate("templates/aop.xml.jet", "org.eclipse.jet.compiled._jet_aopxml" ); //$NON-NLS-1$  //$NON-NLS-2$
            addTemplate("templates/explicitImplementation.aj.jet", "org.eclipse.jet.compiled._jet_explicitImplementationaj" ); //$NON-NLS-1$  //$NON-NLS-2$
            addTemplate("templates/main.jet", "org.eclipse.jet.compiled._jet_main" ); //$NON-NLS-1$  //$NON-NLS-2$
            addTemplate("templates/setClassPackage.jet", "org.eclipse.jet.compiled._jet_setClassPackage" ); //$NON-NLS-1$  //$NON-NLS-2$
            addTemplate("templates/uniqueAnalysis.jet", "org.eclipse.jet.compiled._jet_uniqueAnalysis" ); //$NON-NLS-1$  //$NON-NLS-2$
    }

    public void setDelegateLoader(JET2TemplateLoader loader) {
        this.delegate = loader;
    }
    
    public JET2TemplateLoader getDelegateLoader() {
        return this.delegate;
    }
}

