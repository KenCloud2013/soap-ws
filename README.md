# soap-ws

This is the first snapshot version of the soap-ws library that was developed by Tom Bujok at centeractive ag
for the purposes of the opensphere project -> http://www.opensphere.centeractive.com
This project is NOT under development any more. Many thanks to centeractive for the opportunity to work on this project.

soap-ws project is further developed by Tom Bujok at www.reficio.org
Here's the link to the newest and actively developed version: https://github.com/reficio/soap-ws

### License:
The project is open-source and distributed under the Apache license, Version 2.0.
One module (soap-builder) is distributed under the LGPL 2.1 license (see the Note).
You can confidently use soap-ws in your commercial project.

### Note
This project contains classes extracted from the soapUI code base by centeractive ag
in October 2011. They are located in the soap-builder module. Every extracted class is
annotated with an comment to fulfill he requirements of the LGPL 2.1 license under
which soapUI is released. That is also the reason why soap-builder module is also
released under LGPL 2.1 license. All other soap-ws modules are released under Apache
v.2 license. The main reason behind class the extraction was to separate the code that
is responsible for the generation of the SOAP messages from the rest of the soapUI's
code that is tightly coupled with other modules, such as soapUI's graphical user
interface, etc. The goal was to create an open-source java project whose main
responsibility is to handle SOAP message generation and SOAP transmission purely on
an XML level.

centeractive ag would like to express strong appreciation to SmartBear Software and
to the whole team of soapUI's developers for creating soapUI and for releasing its
source code under a free and open-source licence. centeractive ag extracted and
modifies some parts of the soapUI's code in good faith, making every effort not
to impair any existing functionality and to supplement it according to our
requirements, applying best practices of software design.
