package org.gmod.gbol.simpleObject;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Autogenerated extension of org.gmod.gbol.simpleObject.generated.FeatureRelationshipPublication.
 * Add custom code to this file. 
 *
 * Author: Robert Bruggner, rbruggner@berkeleybop.org
 *
*/

public class FeatureRelationshipPublication extends org.gmod.gbol.simpleObject.generated.AbstractFeatureRelationshipPublication {

    private static final long serialVersionUID = 1L;

    public FeatureRelationshipPublication(){
        super();
    }

//    @Override
//    public Collection<AbstractSimpleObject> getWriteObjects() {
//        ArrayList<AbstractSimpleObject> writeObjects = new ArrayList<AbstractSimpleObject>();
//        // Have to write yourself
//        writeObjects.add(this);
//        
//        // Singletons
//        writeObjects.addAll(this.getPublication().getWriteObjects());
//        
//        return writeObjects;
//    }

    public AbstractSimpleObjectIterator getWriteableObjects()
    {
        return new SimpleObjectIterator(this);
    }

    private static class SimpleObjectIterator extends AbstractSimpleObjectIterator
    {

        private static class Status extends AbstractSimpleObjectIterator.Status
        {
            public final static int pub = 1;
        }
    
        public SimpleObjectIterator(FeatureRelationshipPublication featureRelationathipPub)
        {
            super(featureRelationathipPub);
        }
        
        public AbstractSimpleObject next()
        {
            FeatureRelationshipPublication featureRelationshipPub = (FeatureRelationshipPublication)object;
            AbstractSimpleObject retVal = null;
            if (status != Status.self) {
                retVal = soIter.next();
                if (status == Status.notSet) {
                    processSingletonIterator(Status.pub, featureRelationshipPub.getPublication());
                }
                if (status == Status.pub) {
                    AbstractSimpleObject newClone = processLastSingletonIterator();
                    ((FeatureRelationshipPublication)clone).setPublication((Publication) newClone);
                }
            } else {
                retVal = peek();
                status = Status.done;
            }
            current = retVal;
            return retVal;
        }
    }
    
}